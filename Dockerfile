# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
# copy WAR into image
COPY access.jar /pf/app/access.jar
COPY application.properties /pf/app/application.properties 
# run application with this command line 
CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "-Dspring.config.location=/pf/app/application.properties", "/pf/app/access.jar"]
