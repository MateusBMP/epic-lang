<?php declare(strict_types=1);

define('ROOT_DIR', __DIR__ . '\..');
define('EXEMPLOS_DIR', ROOT_DIR . '\public\exemplos');

chdir(ROOT_DIR);

class ExecReturn {
    public $output;
    public $retval;
}

function compiler_exec(string $params): ExecReturn {
    $ps = 'powershell -InputFormat none -ExecutionPolicy ByPass -NoProfile -File ' . ROOT_DIR . '\compiler.ps1 ' . $params;
    $output = null;
    $retval = null;
    exec($ps, $output, $retval);
    $exec_return = new ExecReturn();
    $exec_return->output = $output;
    $exec_return->retval = $retval;
    return $exec_return;
}

function sol_program($var): bool {
    return substr($var, -4) === ".sol";
}

$r_exec = "";
$p_exemplos = "";
$codigo_flash = "";
$html = <<<HTML
<!DOCTYPE html>
<html lang="en" data-bs-theme="dark">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Interpretador EPIC</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <script src="https://unpkg.com/alpinejs" defer></script>
</head>
<body>
    <div class="container">
        <h1 class="my-5">Interpretador EPIC</h1>
        <form action="/" method="post" x-data="{ comando: 'tree' }">
            <div class="form-floating">
                <textarea class="form-control" placeholder="Escreva o código SOL aqui" id="codigo" name="codigo" style="min-height: 12rem; height: auto;">@CODIGO_FLASH</textarea>
                <label for="codigo">Código SOL</label>
            </div>
            <input type="hidden" name="comando" x-model="comando" />
            <div class="row mt-2">
                <div class="col-12 col-sm-6">
                    <button class="btn btn-primary w-100" x-on:click="comando = 'tree'" x-on:click.debounce="\$event.target.form.submit();">Gerar Árvore</button>
                </div>
                <div class="col-12 col-sm-6">
                    <button class="btn btn-primary w-100" x-on:click="comando = 'gui'" x-on:click.debounce="\$event.target.form.submit();">Visualizar Árvore</button>
                </div>
            </div>
        </form>
        @R_EXEC
        <h2 class="mt-4"> Exemplos </h2>
        <div class="row">
            @P_EXEMPLOS
        </div>
    </div>
</body>
</html>
HTML;

$exemplos = array_filter(scandir(EXEMPLOS_DIR), 'sol_program');
foreach ($exemplos as $exemplo) {
    $programa = file_get_contents(EXEMPLOS_DIR . '\\' . $exemplo, true);
    $p_exemplos .= <<<HTML
<div class="col">
    <div class="card text-bg-dark">
        <div class="card-header">
            <a href="/exemplos/$exemplo" class="font-monospace fw-bold text-decoration-none">$exemplo</a></div>
        <div class="card-body user-select-all">
            <pre><code>$programa</code></pre>
        </div>
    </div>
</div>
HTML;
}

$method = $_SERVER['REQUEST_METHOD'];

if ($method === "POST") {
    $codigo_flash = $_POST['codigo'];
    $comando = $_POST['comando'];
    $tmpfile = tmpfile();
    fwrite($tmpfile, $_POST['codigo']);
    fseek($tmpfile, 0);
    $ps_exec = compiler_exec('run ' . $comando . ' ' . stream_get_meta_data($tmpfile)['uri']);
    fclose($tmpfile);
    $exec_response = implode("<br>", $ps_exec->output);
    $r_exec = <<<HTML
<div class="card text-bg-dark">
    <div class="card-body text-break font-monospace" style="font-size: .875em;">
        $exec_response
    </div>
</div>
HTML;
}

$html = str_replace("@R_EXEC", $r_exec, $html);
$html = str_replace("@P_EXEMPLOS", $p_exemplos, $html);
$html = str_replace("@CODIGO_FLASH", $codigo_flash, $html);

echo $html;
