
mvn clean install -f ./spring-boot-cloud-eureka-server/pom.xml
mvn clean install -f ./spring-boot-cloud-eureka-account-service/pom.xml
mvn clean install -f ./spring-boot-cloud-zuul-routing/pom.xml

START "" java -jar spring-boot-cloud-eureka-server/target/eureka-server.jar 
START "" java -jar spring-boot-cloud-eureka-account-service/target/account-service.jar --server.port=8181
START "" java -jar spring-boot-cloud-eureka-account-service/target/account-service.jar --server.port=8182
START "" java -jar spring-boot-cloud-eureka-account-service/target/account-service.jar --server.port=8183
START "" java -jar spring-boot-cloud-zuul-routing/target/zuul-router.jar --server.port=8080


