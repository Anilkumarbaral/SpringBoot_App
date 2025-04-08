FROM openjdk:17
COPY target/SpringBoot-App.jar /usr/app/SpringBoot-App.jar
WORKDIR /usr/app
ENTRYPOINT ["java", "-jar", "SpringBoot-App.jar"]
