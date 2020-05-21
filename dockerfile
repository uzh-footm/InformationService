FROM openjdk:8-jre

COPY config.yml /data/informationservice/config.yml

ARG JAR_FILE
COPY ${JAR_FILE} /data/informationservice/informationservice.jar

WORKDIR /data/informationservice

RUN java -version

CMD ["java","-jar","informationservice.jar","server","config.yml"]

EXPOSE 8080-8081