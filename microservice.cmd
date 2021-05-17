mvn clean install -f .\spring-boot-cloud-eureka-server\pom.xml
mvn clean install -f .\spring-boot-cloud-zuul-routing\pom.xml
mvn clean install -f .\spring-boot-cloud-eureka-user-service\pom.xml
mvn clean install -f .\spring-boot-cloud-eureka-order-service\pom.xml
mvn clean install -f .\spring-boot-cloud-eureka-notification-service\pom.xml
mvn clean install -f .\spring-boot-cloud-authentication-service\pom.xml

START "Server" java -jar spring-boot-cloud-eureka-server/target/eureka-server.jar 
START "API Gateway" java -jar spring-boot-cloud-zuul-routing/target/zuul-api-gateway.jar --server.port=8080 
START "User Service" java -jar spring-boot-cloud-eureka-user-service/target/user-service.jar --server.port=8181
START "Order Service" java -jar spring-boot-cloud-eureka-order-service/target/order-service.jar --server.port=8282
START "Notification Service" java -jar spring-boot-cloud-eureka-notification-service/target/notification-service.jar --server.port=8383
START "Authentication Service" java -jar spring-boot-cloud-authentication-service/target/authentication-service.jar --server.port=8484
