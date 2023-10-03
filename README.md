# Interpretador EPIC

Este é um projeto de interpretador em Java 20 desenvolvido para executar código escrito na linguagem EPIC com extensão ".sol". O interpretador inclui um analisador léxico e sintático para processar o código EPIC e executá-lo no ambiente Windows. Este README fornece instruções sobre como configurar e executar o projeto.

## Pré-requisitos

Antes de começar, certifique-se de que você tenha o seguinte software instalado em sua máquina:

- [Java 20](https://www.oracle.com/java/technologies/javase-downloads.html): Certifique-se de que o Java 20 esteja instalado e configurado corretamente no seu sistema.
- [PowerShell](https://docs.microsoft.com/en-us/powershell/scripting/install/installing-powershell): O PowerShell é necessário para executar o script PowerShell `compiler.ps1`.

Para utilizar a interface, se desejar, também será necessário instalar o PHP 8.2 ou superior:

- [PHP 8.2](https://www.php.net/downloads): O PHP é necessário para executar a interface gráfica do interpretador EPIC.

## Configuração do Projeto

1. Clone este repositório em sua máquina local:

```shell
git clone https://github.com/MateusBMP/sol-lang
```

2. Navegue até o diretório do projeto:

```shell
cd sol-lang
```

## Compilando o Interpretador EPIC

Para compilar o interpretador EPIC, execute o seguinte comando no PowerShell:

```powershell
.\compiler.ps1 compile
```

Isso irá compilar o interpretador EPIC e deixá-lo pronto para processar código EPIC.

## Executando Código EPIC

Para executar programas EPIC com extensão ".sol", siga estas etapas:

1. Crie ou edite um arquivo com código EPIC (por exemplo, `meu-programa.sol`) na pasta do projeto. 
2. Execute o interpretador EPIC, especificando o arquivo EPIC como argumento:

```powershell
.\compiler.ps1 run eval meu-programa.sol
```

O interpretador processará o código EPIC e executará as instruções.

Podemos também retornar a tabela de tokens com o comando tree:

```powershell
.\compiler.ps1 run tree meu-programa.sol
```

Para analisar a tabela de tokens em uma árvore sintática, execute o comando gui:

```powershell
.\compiler.ps1 run gui meu-programa.sol
```

### Interface Gráfica

A interface do projeto pode ser utilizada para chamar os comandos `tree` e `gui` de forma mais simples. Para isso, é necessário ter o PHP 8.2 ou superior instalado e configurado corretamente no seu sistema. Para executar a interface, execute o seguinte comando no PowerShell:

```powershell
.\compiler.ps1 run-server
```

Agora você pode acessar a interface em seu navegador no endereço `http://localhost:8000`.

### Exemplos de programa EPIC

Você pode encontrar exemplos de programas em [`.\public\exemplos\`](/public/exemplos/). Estes exemplos também podem ser encontrados na interface gráfica do interpretador EPIC.

## Contribuição

Se você quiser contribuir para este projeto, sinta-se à vontade para abrir uma _issue_ ou enviar uma solicitação de _pull request_. Apreciamos contribuições de todos os níveis de habilidade. Possivelmente não trabalharemos mais nele, mas sinta-se à vontade para usá-lo como quiser.

Caso você faça alterações na gramática, pode utilizar o comando `update-grammar` para gerar o código do analisador léxico e sintático novamente. Após isso, será necessário também recompilar o código.

```powershell
.\compiler.ps1 update-grammar
.\compiler.ps1 compile
```

O projeto utilizar o Antlr4, portanto também adicionamos uma chamada para o Antlr4 no script `compiler.ps1`. Caso você queira utilizar o Antlr4 diretamente, basta utilizar o comando `antlr4`:

```powershell
.\compiler.ps1 antlr4 [...] # Adicione os argumentos do antlr4 aqui
```

## Licença

Este projeto é licenciado sob a Licença MIT. Consulte o arquivo [LICENSE](LICENSE) para obter detalhes.
