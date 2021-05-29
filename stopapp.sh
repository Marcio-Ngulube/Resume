#!/usr/bin/env bash
SERVICE='ceevee-ssl-server-0.0.1-SNAPSHOT.jar'
 
if ps ax | grep -v grep | grep $SERVICE > /dev/null
then
    echo "$SERVICE service running, everything is fine"
	ps -ef | grep ceevee-ssl-server-0.0.1-SNAPSHOT.jar | grep -v grep | awk '{print $2}' | xargs kill
else
    echo "$SERVICE is not running"
    echo "$SERVICE is not running!" | mail -s "$SERVICE down" root
fi

