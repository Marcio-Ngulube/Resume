#!/usr/bin/env bash
echo 'Starting Spring Boot app'
cd '/home/ubuntu/app/access'
java -jar -Dspring.config.location=application.properties ceevee-ssl-server-0.0.1-SNAPSHOT.jar
