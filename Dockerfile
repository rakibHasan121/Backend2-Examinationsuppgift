FROM openjdk:11

EXPOSE 8080

ARG JAR_FILE=target/kubernetes_uppgift*.jar

COPY ${JAR_FILE} kubernetes_uppgift.jar

ENTRYPOINT ["java", "-jar", "/kubernetes_uppgift.jar"]