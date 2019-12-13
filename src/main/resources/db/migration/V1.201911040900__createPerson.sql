create table person (id varchar(255) not null, firstname varchar(255), lastname varchar(255), version int8, primary key (id));
create table person_aud (id varchar(255) not null, rev int4 not null, revtype int2, firstname varchar(255), lastname varchar(255), primary key (id, rev));
alter table if exists person_aud add constraint FK9lyxk62ui3cyr5k0w8etnfqkm foreign key (rev) references revinfo;