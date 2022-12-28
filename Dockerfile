FROM openjdk:8
COPY target/git-mav-jen-dock-integration.jar git-mav-jen-dock-integration.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/git-mav-jen-dock-integration.jar"]