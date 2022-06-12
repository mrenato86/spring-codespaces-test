# FROM eclipse-temurin:17-jdk-alpine
# WORKDIR /opt/app
# COPY target/spring-codespaces-test-0.0.1-SNAPSHOT.jar app.jar
# CMD ["java", "-jar", "app.jar"]

# Alkalmazás futtatása Docker Compose-zal
#
FROM eclipse-temurin:17 as builder
WORKDIR application
COPY target/*.jar hello.jar
RUN java -Djarmode=layertools -jar hello.jar extract

FROM eclipse-temurin:17
WORKDIR application

ADD https://raw.githubusercontent.com/vishnubob/wait-for-it/master/wait-for-it.sh .
RUN chmod +x ./wait-for-it.sh

COPY --from=builder application/dependencies/ ./
COPY --from=builder application/spring-boot-loader/ ./
COPY --from=builder application/snapshot-dependencies/ ./
COPY --from=builder application/application/ ./
ENTRYPOINT ["java", \
 "org.springframework.boot.loader.JarLauncher"]