CREATE TABLE
    IF NOT EXISTS public.address_book
(
    id            UUID    NOT NULL,
    when_created  TIMESTAMP WITHOUT TIME ZONE,
    when_modified TIMESTAMP WITHOUT TIME ZONE,
    version       BIGINT,
    deleted       BOOLEAN NOT NULL,
    phone_number  VARCHAR(255),
    email_address VARCHAR(255),
    CONSTRAINT pk_address_book PRIMARY KEY (id)
);

CREATE TABLE
    IF NOT EXISTS public.locations
(
    id            UUID    NOT NULL,
    when_created  TIMESTAMP WITHOUT TIME ZONE,
    when_modified TIMESTAMP WITHOUT TIME ZONE,
    version       BIGINT,
    deleted       BOOLEAN NOT NULL,
    address       VARCHAR(255),
    city          VARCHAR(255),
    country       VARCHAR(255),
    CONSTRAINT pk_locations PRIMARY KEY (id)
);

CREATE TABLE
    IF NOT EXISTS public.users
(
    id            UUID         NOT NULL,
    when_created  TIMESTAMP WITHOUT TIME ZONE,
    when_modified TIMESTAMP WITHOUT TIME ZONE,
    version       BIGINT,
    deleted       BOOLEAN      NOT NULL,
    title         VARCHAR(255) NOT NULL,
    first_name    VARCHAR(255) NOT NULL,
    last_name     VARCHAR(255) NOT NULL,
    password      VARCHAR(255) NOT NULL,
    is_not_locked BOOLEAN,
    address_id    UUID,
    location_id   UUID,
    role          VARCHAR(255),
    CONSTRAINT pk_users PRIMARY KEY (id)
);

ALTER TABLE public.users
    ADD CONSTRAINT FK_USERS_ON_ADDRESS FOREIGN KEY (address_id) REFERENCES public.address_book (id);

ALTER TABLE public.users
    ADD CONSTRAINT FK_USERS_ON_LOCATION FOREIGN KEY (location_id) REFERENCES public.locations (id);