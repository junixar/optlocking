--liquibase formatted sql

--changeset bob:3
ALTER SESSION ENABLE PARALLEL DML;

--changeset bob:4
SELECT count(*) FROM syrius.e; 
INSERT INTO syrius.e VALUES ('blub', 'myeamil'); 
INSERT INTO syrius.e VALUES ('bling', 'myeamil'); 
SELECT count(*) FROM syrius.e; 

--changeset bob:5
ALTER SESSION DISABLE PARALLEL DML;