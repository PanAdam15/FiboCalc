FROM openjdk:8-jdk-alpine
COPY ./out/artifacts/fibcalc_jar/fibcalc.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java", "-jar", "fibcalc.jar"]