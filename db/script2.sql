CREATE DATABASE IF NOT EXISTS saludadores;
CREATE USER IF NOT EXISTS 'saludos'@'servicio_web.db_default' IDENTIFIED by '123456';
grant all privileges on saludos.* to 'saludos'@'localhost';
FLUSH PRIVILEGES;