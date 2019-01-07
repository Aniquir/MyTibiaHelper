CREATE TABLE mounts(
    id bigserial NOT NULL,
    name varchar(50) NOT NULL,
    taming varchar(50) NOT NULL,
    occurence varchar(128) NOT NULL,
    owned boolean,
    PRIMARY KEY (id)
    );