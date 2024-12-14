## Exemplo de projeto simples em JavaFX com Spring boot
Esta é uma aplicação simples feita com Spring Boot + Java FX

- #### como baixar dependencias
  ```shell
  mvn install -DskipTests
  ```

- #### como rodar a aplicação
  ```shell
  mvn spring-boot:run
  ```

- #### como rodar os testes
  ```shell
  mvn test
  ```

- #### como fazer o build do pacote
  ```shell
  mvn clean package
  ```

- #### executando aplicação depois do build
  ```shell
  java -jar target/ui*.jar
  ```