FROM openjdk:11-jdk
MAINTAINER <luiz.celeguim@gmail.com>
EXPOSE 8081
ENV _JAVA_OPTIONS "-Xms256m -Xmx512m -Djava.awt.headless=true"
VOLUME /data
COPY ./target/contacts-0.0.1-SNAPSHOT.jar /app/contacts.jar
CMD ["java", "-jar", "/app/contacts.jar"]
