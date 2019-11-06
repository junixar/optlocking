-- Table: public.contract

-- DROP TABLE public.contract;

CREATE TABLE public.contract
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    name character varying(255) COLLATE pg_catalog."default",
    person_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT contract_pkey PRIMARY KEY (id),
    CONSTRAINT fk9os0rerwj7q4finn5ufs1s9u5 FOREIGN KEY (person_id)
        REFERENCES public.person (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.contract
    OWNER to postgres;


-- Table: public.contract_aud

-- DROP TABLE public.contract_aud;

CREATE TABLE public.contract_aud
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    rev integer NOT NULL,
    revtype smallint,
    name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT contract_aud_pkey PRIMARY KEY (id, rev),
    CONSTRAINT fkdwmknd8t7wjko72bg4ka0gtnb FOREIGN KEY (rev)
        REFERENCES public.revinfo (rev) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.contract_aud
    OWNER to postgres;

-- Table: public.person_contract_aud

-- DROP TABLE public.person_contract_aud;

CREATE TABLE public.person_contract_aud
(
    rev integer NOT NULL,
    person_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    revtype smallint,
    CONSTRAINT person_contract_aud_pkey PRIMARY KEY (rev, person_id, id),
    CONSTRAINT fkdrsxioqh89h7xseh28jcqttqy FOREIGN KEY (rev)
        REFERENCES public.revinfo (rev) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.person_contract_aud
    OWNER to postgres;
