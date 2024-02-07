FROM openjdk:17-jdk-alpine

WORKDIR /usr/app

COPY ./target/webService-0.0.1-SNAPSHOT.jar /usr/app/

EXPOSE 85

ENTRYPOINT [ "java","-jar","webService-0.0.1-SNAPSHOT.jar" ]