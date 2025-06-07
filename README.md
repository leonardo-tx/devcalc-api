# DevCalc API
![Dev Calc API CI](https://github.com/leonardo-tx/devcalc-api/actions/workflows/ci.yml/badge.svg)

## TP1

Esse projeto tem como proposta calcular números, expondo endpoints para
subtrair, adicionar, multiplicar e dividir.

As ferramentas escolhidas são as seguintes:
- Java 21
- Maven
- SpringBoot

### Como executar o projeto
No diretório raiz do projeto, execute o seguinte comando:
```bash
mvn clean install # Use o argumento -DskipTests caso queira pular os testes
mvn spring-boot:run
```

### Workflows presentes
Aqui está descrito os workflows atuais do projeto.

#### WorkFlow [hello.yml]
Um workflow que é executado quando há um push no main ou
um pull request para o main, sendo imprimido
"Pipeline iniciado com sucesso".

#### Workflow [ci.yml]
Um workflow que é executado quando há um push no main ou
um pull request para o main em uma edição no src, sendo feito
o checkout do projeto, o build do projeto e a execução dos testes.

## TP2

### Corrigindo problema de Workflow
Como pedido no TP2, para corrigir o workflow, foi necessário ir na
aba Actions e ir no action falho, após isso, na parte de log do
action, é possível ver o seguinte problema:
```
Invalid workflow file: .github/workflows/hello.yml#L12
The workflow is not valid. .github/workflows/hello.yml (Line: 12, Col: 3): The identifier 'hello@#' is invalid. IDs may only contain alphanumeric characters, '_', and '-'. IDs must start with a letter or '_' and and must be less than 100 characters.
```
Com o erro acima, é só resolver o nome inválido do job em hello.yml.

### Principal diferença entre o Workflow Automático e Manual de ci.yml
Os dois modos desempenham funções semelhantes, entretanto no automático, 
o valor dos inputs para a action de lint-and-test.yml sempre é verdadeiro,
enquanto no manual é possível escolher qual executar, alternando entre falso
ou verdadeiro.

## TP3
Todas as explicações se encontram no PDF do trabalho. Aqui será colocado trechos do PDF.

### Configuração de Runner Auto-Hospedado
Para o runner auto hospedado, foi utilizado meu sistema Linux pessoal que usa o Arch
Linux. Sendo executado comandos para mostrar informações do sistema, e a versão do
Java, além da instalação e remoção de um driver vulkan do projeto open-source Mesa,
que é o NVK (Nouveau Vulkan Driver), que é para placas de vídeo NVIDIA.
O arquivo de workflow criado para esse caso é o self-hosted.yml

### Uso de Variáveis e Secrets no Workflow
O arquivo de workflow criado para esse caso é o variable-secret.yml. Usa variáveis e secrets
configurados na seção de actions.

### Contextos e Escopos de Variáveis de Ambiente
Nesse exercício foi testado sobrescritas e escopos diferentes de variável de ambiente, o
nome do arquivo é o mesmo pedido pelo trabalho. (env-context-demo.yml)

### Controle de Permissões e Uso do GITHUB_TOKEN
Para criar a issue, foi utilizado uma action do github action reutilizável chamada de
JasonEtco/create-an-issue@v2, o GITHUB_TOKEN é colocado ao action utilizando o env
para passar o mesmo como uma variável de ambiente para o action criar a issue.

Para obter esse GITHUB_TOKEN, é necessário usar o secrets.GITHUB_TOKEN

O workflow criado se encontra no arquivo issue.yml, onde há um job chamado de
important que força um erro e um job nomeado de failure, que aciona quando o job
important falha, criando a issue.

### Ambientes de Deploy para Dev e Prod
Cria ambientes de dev e prod nas configurações de repositório. Modifica o arquivo ci.yml
para acionar o deploy dev em um push no branch dev e o deploy prod em um push no branch main.

### Implementação e Integração de Nova Funcionalidade na API
As funcionalidades e testes foram feitos em um pull request separado, no PDF estão os
testes executados e o uso do endpoint no Postman.
