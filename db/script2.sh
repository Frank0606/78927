#!/bin/sh
service mariadb restart
# Para que no sea un proceso bloqueante y se mantenga encendido el servicio porque la base de datos necesita estar encendida siempre
tail -f /dev/null