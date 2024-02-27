FROM openjdk:17-jdk
WORKDIR /app
COPY target/payetonkawa-0.0.1-SNAPSHOT.jar /app/payetonkawa-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "payetonkawa-0.0.1-SNAPSHOT.jar"]