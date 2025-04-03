# Étape 1 : Construction de l'application
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /RoutageAppBackEnd
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Étape 2 : Création de l'image finale
FROM openjdk:17-jdk-slim
WORKDIR /RoutageAppBackEnd
COPY --from=build /RoutageAppBackEnd/target/*.jar RoutageAppBackEnd.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "RoutageAppBackEnd.jar"]