--liquibase formatted sql
--changeset bob:3
create table c1 (id varchar(255) not null, firstname varchar(255), primary key (id));

--changeset yyu:4
create table c2 (id varchar(255) not null, firstname varchar(255), primary key (id));
