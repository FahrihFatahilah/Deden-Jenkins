FROM openjdk:8

EXPOSE 8080
ADD target/docker-demo.jar docker-demo
ENTRYPOINT ["java","-jar","/docker-demo.jar"]
