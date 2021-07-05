FROM openjdk:11
ADD target/jenkins-first.jar jenkins-first.jar
EXPOSE 8091
ENTRYPOINT ["java", "-jar", "jenkins-first.jar"]