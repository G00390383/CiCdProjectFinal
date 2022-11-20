FROM openjdk:11
COPY ./out/production/DockerHelloJava/ /tmp
WORKDIR /tmp
ENTRYPOINT ["java","HelloWorld"]