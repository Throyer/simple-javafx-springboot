## Exemplo de projeto simples em JavaFX com Spring boot

Uma aplicação com JavaFX e Spring boot.

### como utilizar
```shell
# Baixe as dependencias (o parametro -DskipTests pula os testes)
$ mvn install -DskipTests

# Rode a aplicação
$ mvn spring-boot:run

# Para rodar os testes
$ mvn test

# Para gerar o relatorio de cobertura apos os testes (fica disponivel em: target/site/jacoco/index.html)
$ mvn jacoco:report

# Para buildar para produção
$ mvn clean package

# depois de buildar, a aplicação pode ser executada com o seguinte comando
$ java -jar simple-X.X.X-X

# lembre-se de subistituir os X pela versão mais atual (em pom.xml)
```