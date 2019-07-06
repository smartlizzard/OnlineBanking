FROM openjdk:8
ADD target/techfish.jar techfish.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/techfish.jar"]