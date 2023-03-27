FROM openjdk:11-jre-slim
EXPOSE 8080
ADD target/consola-1.0-SNAPSHOT.jar consola-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "consola-1.0-SNAPSHOT.jar"]
