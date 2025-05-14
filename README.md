# DevCalc API
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
