# springboot-graphql
Spring Boot with Graphql integration

# Documentation
https://github.com/graphql-java-kickstart

# Playground 
localhost:8080/playground

Single api endpoint for all calls
localhost:8080/graphql


request body sample
{
  bankAccount(id:101){
    name
  }
  allBankAccounts{
    id
  }
}