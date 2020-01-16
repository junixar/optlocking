--liquibase formatted sql

--changeset bob:3
ALTER SESSION ENABLE PARALLEL DML;

--changeset bob:4
INSERT INTO syrius.e VALUES ('bla', 'myeamil'); 
INSERT INTO syrius.e VALUES ('blub', 'myeamil'); 
INSERT INTO syrius.e VALUES ('bling', 'myeamil'); 

--changeset bob:5
ALTER SESSION DISABLE PARALLEL DML;