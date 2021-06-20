#!/usr/bin/env bash
echo 'Starting Spring Boot app'
cd '/home/ubuntu/app/access'
mv *.jar access.jar
docker build -t access:lts .
sh kub.sh
