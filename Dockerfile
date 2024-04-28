FROM java:8-jdk-alpine
COPY target/search-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch search-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","search-0.0.1-SNAPSHOT.jar"]