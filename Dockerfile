FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:11-jre-slim AS installer
VOLUME /tmp
EXPOSE 8080
RUN mkdir -p /app/ 
RUN mkdir -p /app/logs/
COPY --from=build /home/app/target/desafio-service-2.4.0.jar /app/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=container", "-jar", "/app/app.jar"]