# Step 1: Use Maven to build the Spring Boot app
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY expense-api /app
RUN mvn clean install -DskipTests

# Step 2: Use a lighter image to run the app
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
