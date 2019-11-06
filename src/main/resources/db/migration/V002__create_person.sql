-- Table: public.person

-- DROP TABLE public.person;

CREATE TABLE public.person
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    name character varying(255) COLLATE pg_catalog."default",
    version bigint,
    CONSTRAINT person_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.person
    OWNER to postgres;

-- Table: public.person_aud

-- DROP TABLE public.person_aud;

CREATE TABLE public.person_aud
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    rev integer NOT NULL,
    revtype smallint,
    name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT person_aud_pkey PRIMARY KEY (id, rev),
    CONSTRAINT fk9lyxk62ui3cyr5k0w8etnfqkm FOREIGN KEY (rev)
        REFERENCES public.revinfo (rev) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.person_aud
    OWNER to postgres;
