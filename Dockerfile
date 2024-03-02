FROM openjdk:17-jdk
WORKDIR /app
COPY target/order-0.0.1-SNAPSHOT.jar /app/order-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "order-0.0.1-SNAPSHOT.jar"]