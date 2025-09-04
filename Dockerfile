# Step 1: Use Java 17 base image
FROM openjdk:17-jdk-slim

# Step 2: Copy the jar file
COPY target/MagicTrick-0.0.1-SNAPSHOT.jar app.jar



# Step 3: Run the jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
