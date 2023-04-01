FROM openjdk:11
EXPOSE 8080
ADD target/cicd-using-github-actions.jar cicd-using-github-actions.jar
ENTRYPOINT ["java","-jar","/cicd-using-github-actions.jar"]