FROM openjdk:17-ea-jdk-oracle
VOLUME /tmp
EXPOSE 8000
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]