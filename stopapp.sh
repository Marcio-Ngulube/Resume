#!/bin/bash
ps -ef | grep ceevee-ssl-server-0.0.1-SNAPSHOT.jar | grep -v grep | awk '{print $2}' | xargs kill
