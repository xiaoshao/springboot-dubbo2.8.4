FROM xiaoshao/hw-jdk8

RUN mkdir /opt/app

ADD target/dubbo-provider-1.0-SNAPSHOT.jar /opt/app/app.jar

EXPOSE 20880

CMD ["bash", "-c", "java -jar /opt/app/app.jar"]