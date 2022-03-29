FROM --platform=linux/arm64 openjdk:8-jdk-alpine
ADD target/HelloWorld-0.0.1-SNAPSHOT.jar ap.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/ap.jar"]
