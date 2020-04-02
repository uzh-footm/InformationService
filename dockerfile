FROM openjdk:8-jdk

COPY config.yml /data/informationservice/config.yml
COPY target/informationservice-1.0-SNAPSHOT.jar /data/informationservice/informationservice-1.0-SNAPSHOT.jar

WORKDIR /data/informationservice

RUN java -version

CMD ["java","-jar","informationservice-1.0-SNAPSHOT.jar","server","config.yml"]

EXPOSE 8080-8081