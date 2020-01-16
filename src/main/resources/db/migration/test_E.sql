--liquibase formatted sql

--changeset bob:1
create table syrius.e (id varchar(255) primary key, firstname varchar(255));
ALTER TABLE syrius.e ADD Email varchar(255);

--changeset bob:2
INSERT INTO syrius.e VALUES ('111', 'Hugo', 'myeamil'); 
ALTER TABLE syrius.e DROP COLUMN firstname;