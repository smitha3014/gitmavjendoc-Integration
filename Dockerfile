FROM openjdk:8
EXPOSE 8080
ADD target/git-mav-jen-dock-integration.jar git-mav-jen-dock-integration.jar
ENTRYPOINT ["java","-jar","/git-mav-jen-dock-integration.jar"]