FROM openjdk:8
EXPOSE 8080
ADD target/spring-graphql-api.jar spring-graphql-api.jar
ENTRYPOINT ["java","-jar","/spring-graphql-api.jar"]