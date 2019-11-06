-- Table: public.revinfo

-- DROP TABLE public.revinfo;

CREATE TABLE public.revinfo
(
    rev integer NOT NULL,
    revtstmp bigint,
    CONSTRAINT revinfo_pkey PRIMARY KEY (rev)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.revinfo
    OWNER to postgres;
