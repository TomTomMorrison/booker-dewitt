FROM gradle:7.5.0-jdk11 AS build_stage
COPY --chown=gradle:gradle . /project
WORKDIR /project
RUN gradle clean assemble
FROM openjdk:11-jre-slim-buster
COPY --from=build_stage /project/build/libs/*.jar ./build/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "build/app.jar"]