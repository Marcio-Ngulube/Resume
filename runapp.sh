#!/usr/bin/env bash
echo 'Starting Spring Boot app'
cd '/home/ubuntu/app/access'
<<<<<<< HEAD
mv *.jar access.jar
docker build -t access:lts .
sh kub.sh
=======
/usr/lib/jvm/java-8-openjdk-amd64/bin/java -jar -Dspring.config.location=application.properties ceevee-ssl-server-0.0.1-SNAPSHOT.jar > /dev/null 2> /dev/null < /dev/null &
>>>>>>> 02e89d46cb22db8e57332a110880bf5c36be984c
