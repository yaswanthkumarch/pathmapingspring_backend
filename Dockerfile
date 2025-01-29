# Use the official Java image from Docker Hub
FROM openjdk:21-jdk-slim AS build

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/myapp.jar /app/myapp.jar

# Expose the port that your Spring Boot app will run on
EXPOSE 8080

# Command to run the app
ENTRYPOINT ["java", "-jar", "/app/myapp.jar"]
