FROM eclipse-temurin:19
LABEL maintainer="sonu@wipro.com"
WORKDIR /app
COPY target/springboot-docker-demo.jar /app/dockerdemo-demo.jar
ENTRYPOINT ["java","-jar","dockerdemo-demo.jar"]