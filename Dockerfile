# Use OpenJDK 21 as base image
FROM eclipse-temurin:21-jdk-alpine

# Set work directory
WORKDIR /app

# Copy the jar file into the container
COPY target/lungcancer-1.0.jar app.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]


