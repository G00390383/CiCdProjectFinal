FROM openjdk:11
COPY ./out/production/DockerHelloJava/ /tmp
WORKDIR /tmp
CMD echo "Hello world! This is my first Docker image."
ENTRYPOINT ["java","HelloWorld"]