# Start with a base image containing Java runtime
FROM openjdk:17-jdk-alpine

# Add Maintainer Info
LABEL maintainer="g00390383@atu.ie"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8081 available to the world outside this container
EXPOSE 8081

# The application's jar file
ARG JAR_FILE=target/cicdprojectfinal-latest.jar

# Add the application's jar to the container
ADD ${JAR_FILE} cicdprojectfinal-latest.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/cicdprojectfinal-latest.jar"]