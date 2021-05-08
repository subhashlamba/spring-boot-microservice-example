mvn clean install -f ./spring-boot-cloud-eureka-server\pom.xml
mvn clean install -f ./spring-boot-cloud-zuul-routing\pom.xml
mvn clean install -f ./spring-boot-cloud-eureka-user-service\pom.xml
mvn clean install -f ./spring-boot-cloud-eureka-order-service\pom.xml
mvn clean install -f ./spring-boot-cloud-authentication-service\pom.xml

java -jar spring-boot-cloud-eureka-server/target/eureka-server.jar  &
java -jar spring-boot-cloud-zuul-routing/target/zuul-api-gateway.jar --server.port=8080  &
java -jar spring-boot-cloud-eureka-user-service/target/user-service.jar --server.port=8181 &
java -jar spring-boot-cloud-eureka-order-service/target/order-service.jar --server.port=8282 &
java -jar spring-boot-cloud-authentication-service/target/authentication-service.jar --server.port=8383 &
