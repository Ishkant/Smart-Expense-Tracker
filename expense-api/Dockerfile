# Use official Java image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/*.jar app.jar

# Expose the port the app runs on
EXPOSE 8080

# Command to run your app
ENTRYPOINT ["java", "-jar", "app.jar"]
