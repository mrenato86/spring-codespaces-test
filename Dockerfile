FROM eclipse-temurin:17-jdk-alpine
WORKDIR /opt/app
COPY target/spring-codespaces-test-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]