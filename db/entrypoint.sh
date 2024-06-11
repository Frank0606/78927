#!/bin/sh
service mariadb restart
mysql < /app/script2.sql
tail -f /dev/null