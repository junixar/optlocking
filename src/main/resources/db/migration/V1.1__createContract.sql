-- Table: public.contract

-- DROP TABLE public.contract;

CREATE TABLE contract
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT pk_contract PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE contract
    OWNER to postgres;
