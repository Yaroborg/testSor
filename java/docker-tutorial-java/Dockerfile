# ---------- build stage ----------
FROM maven:3.9.8-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn -q -DskipTests dependency:go-offline
COPY src ./src
RUN mvn -q -DskipTests package

# ---------- run stage ----------
FROM eclipse-temurin:21-jre
WORKDIR /app
ENV SERVER_PORT=8081
ENV DB_URL=jdbc:postgresql://mypg:5432/postgres
ENV DB_USERNAME=demo
ENV DB_PASSWORD=demo
COPY --from=build /app/target/*-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app/app.jar"]


