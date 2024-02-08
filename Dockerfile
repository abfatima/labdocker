FROM openjdk:17-jdk-alpine

WORKDIR /usr/app

COPY ./target/demoDocker.jar /usr/app/

EXPOSE 8085

ENTRYPOINT [ "java","-jar","demoDocker.jar" ]