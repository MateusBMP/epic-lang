function Get-Usage {
    Write-Output "Usage: ./compiler.ps1 [command] [args]"
    Write-Output "Commands:"
    Write-Output "  antlr4 [args]  Pass the command to the ANTLR4 tool"
    Write-Output "  compile        Compile the generated code"
    Write-Output "  run [args]     Run the compiled code"
    Write-Output "  update-grammar Update the grammar file from the ANTLR4 tool"
}

function Get-Subfolders {
    param(
        [Parameter(Mandatory=$true)]
        [string]$Path
    )

    $Folders = Get-ChildItem -Path $Path -Directory
    $Folders = $Folders | Select-Object -ExpandProperty FullName
    $Folders = $Folders | ForEach-Object { Get-Subfolders -Path $_ }
    $Folders += $Path + ";"
    return $Folders
}

function Get-Compiler-Classpath {
    $CurrentPath = Get-Location | Select-Object -ExpandProperty Path
    $InitialPath = $CurrentPath + "\src\compiler"
    $Classpath = [string](Get-Subfolders -Path $InitialPath)
    $Classpath += $CurrentPath + "\dependencies\antlr-4.13.0-complete.jar"
    return $Classpath
}

function Get-Compiler-Java-Files {
    $Files = Get-ChildItem -Path "./src/compiler" -Recurse -Include "*.java"
    $Files = $Files | Select-Object -ExpandProperty FullName
    $Files = $Files -join " "
    return $Files
}

If ($Args.Count -lt 1) {
    Get-Usage
    return
}

if ($args.Count -gt 1) {
    $Tail = $Args[1..($Args.Count - 1)]
    $Tail = $Tail -join " "
} else {
    $Tail = ""
}

switch ($Args[0].ToLower()) {
    "antlr4" { "java -jar ./dependencies/antlr-4.13.0-complete.jar " + $Tail | Invoke-Expression }
    "compile" {
        if (Test-Path ".target/") {
            Remove-Item -Recurse -Force -Path ".target/" | Out-Null
        }
        New-Item -ItemType Directory -Force -Path ".target/" | Out-Null
        "javac -Xlint:deprecation -Xlint:unchecked -cp `"" + (Get-Compiler-Classpath) + "`" -d `".target/`" " + (Get-Compiler-Java-Files) | Invoke-Expression
    }
    "run" {
        if (-Not (Test-Path ".target/")) {
            Write-Output "Please compile the code first with `".\compiler.ps1 compile`""
            return
        }
        "java -cp `".target/;./dependencies/antlr-4.13.0-complete.jar`" compiler.App " + $Tail | Invoke-Expression
    }
    "update-grammar" {
        java -jar "./dependencies/antlr-4.13.0-complete.jar" -o "./src/compiler/sol/antlr" -package compiler.sol.antlr -listener -visitor "./src/compiler/sol/Sol.g4"
    }
    Default { Get-Usage }
}
