#!/usr/bin/env bash
SERVICE='svc/access'
 
if ps ax | grep -v grep | grep $SERVICE > /dev/null
then
    echo "$SERVICE service running, everything is fine"
	ps -ef | grep svc/access | grep -v grep | awk '{print $2}' | xargs kill
else
    echo "$SERVICE is not running"
    echo "$SERVICE is not running!" | mail -s "$SERVICE down" root
fi

