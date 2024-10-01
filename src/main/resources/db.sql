create table public.test_table
(
    id            uuid not null
        constraint test_table_pk
            primary key,
    full_name     varchar(255),
    when_created  timestamp with time zone,
    when_modified timestamp with time zone,
    registered    timestamp with time zone
);

alter table public.test_table
    owner to portal;