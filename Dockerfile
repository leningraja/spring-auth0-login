FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .

RUN mvn clean install

FROM openjdk:17-jdk-slim

EXPOSE 3000

COPY --from=build /target/spring-mvc-login-okta-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]