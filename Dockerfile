FROM eclipse-temurin:17
RUN mkdir /opt/app
COPY target/spring-codespaces-test-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/spring-codespaces-test-0.0.1-SNAPSHOT.jar"]