# Application in Spring Boot

Ao realizar o git clone, é altamente recomendado trabalhar com o Docker. Utilizei a imagem:
https://hub.docker.com/r/springci/spring-boot-ci-image

Docker irá instalar tudo, você apenas precisará rodar o seguinte comando na raiz do projeto: 
./mvnw package && java -jar target/gs-spring-boot-docker-0.1.0.ja

como nós estamos usando o maven, esse comando fazerá absolutamente tudo, você poderá trabalhar localmente apenas com o Docker. 

Qualquer dúvida: robsonadorno_@hotmail.com
