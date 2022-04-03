FROM openjdk:8
EXPOSE 2233
ADD target/spring-jenkins-docker.jar spring-jenkins-docker.jar
ENTRYPOINT ["java","-jar","spring-jenkins-docker.jar"]