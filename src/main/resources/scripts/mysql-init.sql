DROP DATABASE IF EXISTS recommendationtypeservice ;
DROP USER IF EXISTS `recommendation_type_service`@`%`;
CREATE DATABASE IF NOT EXISTS recommendationtypeservice CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE USER IF NOT EXISTS `recommendation_type_service`@`%` IDENTIFIED WITH mysql_native_password BY 'password';
GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES, INDEX, ALTER, EXECUTE, CREATE VIEW, SHOW VIEW,
CREATE ROUTINE, ALTER ROUTINE, EVENT, TRIGGER ON `recommendationtypeservice`.* TO `recommendation_type_service`@`%`;
FLUSH PRIVILEGES;