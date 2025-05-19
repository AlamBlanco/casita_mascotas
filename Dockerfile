FROM openjdk:23-jdk
ARG JAR_FILE=casitaMascotas/target/casitaMascotas-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app_casaMascotas.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_casaMascotas.jar"]