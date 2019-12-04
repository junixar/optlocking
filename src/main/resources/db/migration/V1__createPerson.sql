CREATE TABLE person
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    firstname character varying(255) COLLATE pg_catalog."default",
    lastname character varying(255) COLLATE pg_catalog."default",
    partner_nr bigint,
    CONSTRAINT pk_person PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE person
    OWNER to postgres;
COMMENT ON TABLE person
    IS 'A String';
