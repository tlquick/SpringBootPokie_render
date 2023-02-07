#
# Build stage
#
FROM maven:3.8.2-jdk-11 AS build
COPY . .
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM openjdk:11-jdk-slim
COPY --from=build /target/pokie-0.0.1-SNAPSHOT.jar pokie.jar
# ENV PORT=8081
EXPOSE 8081
ENTRYPOINT ["java","-jar","pokie.jar"]