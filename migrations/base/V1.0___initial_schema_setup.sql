create table if not exists nursery
(
    id serial not null
        constraint nursery_pk primary key,
    name varchar(255) not null,
    email varchar(255) not null,
    contact_number varchar(255) not null,
    address_id integer not null
        constraint address_id_fk references address
);

create table if not exists user
(
    id serial not null
        constraint user_pk primary key,
    name varchar(255) not null,
    email varchar(255) not null,
    password varchar (50) not null,
    contact_number varchar(255) not null,
    address_id integer not null
        constraint address_id_fk references address
);

create table if not exists address
(
    id serial not null
        constraint address_pk primary key,
    address varchar(255) not null,
    city varchar(255) not null,
    postcode varchar (10) not null
);

create table if not exists child
(
    id serial not null
        constraint child_pk primary key,
    name varchar(255) not null,
    dob varchar(20) not null
);

create table if not exists user_child
(
    user_id integer not null
        constraint user_id_fk references user,
    child_id integer not null
        constraint child_id_fk references child
);

create table if not exists nursery_child_date_request
(
    id integer not null
        constraint nursery_child_date_request_pk primary key,
    date varchar(20) not null,
    child_id integer not null
        constraint child_id_fk references child,
    nursery_id integer not null
        constraint nursery_id_fk references nursery
);

create table if not exists nursery_date_available
(
    id integer not null
        constraint nursery_date_available_pk primary key,
    date varchar(20) not null,
    nursery_id integer not null
        constraint nursery_id_fk references nursery
);

create table if not exists nursery_date_booked
(
    id integer not null
        constraint nursery_date_booked_pk primary key,
    nursery_date_available_id integer not null
        constraint nursery_date_available_id_fk references nursery_date_available,
    nursery_child_date_request_id integer not null
        constraint nursery_child_date_request_id_fk references nursery_child_date_request
);








