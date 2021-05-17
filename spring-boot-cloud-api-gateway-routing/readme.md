# API Gateway
    This microservice is about the API gateway.
        - all request come first and it will forword requests appopriate microservice.
        - It's alternative to zool API gateway
        - Document for the [Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway)

```
spring:
  application:
    name: api-gateway-service
  cloud:
    gateway:
      routes:
        - id: user-service
          uri: lb://USER-SERVICE
          predicates:
            - Path=/user/**
        - id: order-service
          uri: lb://ORDER-SERVICE
          predicates:
            - Path=/order/**
        - id: authentication-service
          uri: lb://authentication-service
          predicates:
            - Path=/oauth/**
        - id: notification-service
          uri: lb://notification-service
          predicates:
            - Path=/notification/**

```

 - any request start with "/user/*" will be forwarded to user service
 - any request start with "/order/*" will be forwarded to order service
 - any request start with "/oauth/*" will be forwarded to authentication service
 - any request start with "/notification/*" will be forwarded to notification service