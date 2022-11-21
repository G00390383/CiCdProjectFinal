FROM openjdk:11
ADD target/docker-spring.jar docker-spring.jar
EXPOSE 8085
CMD echo "Hello world! This is my first Docker image."
ENTRYPOINT ["java", "-jar","docker-spring.jar"]