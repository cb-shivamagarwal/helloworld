FROM openjdk:8-jdk-alpine
ADD target/HelloWorld-0.0.1-SNAPSHOT.jar ap.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar","/ap.jar"]
