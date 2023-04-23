SET datestyle = dmy;

create table if not exists address
(
    id serial not null
        constraint address_pk primary key,
    address varchar(255) not null,
    city varchar(255) not null,
    postcode varchar (10) not null
);

create table if not exists app_user
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

create table if not exists app_user_nursery
(
    id serial not null
        constraint app_user_nursery_pk primary key,
    app_user_id integer not null
        constraint app_user_id_fk references app_user
);

create table if not exists app_user_guardian
(
    id serial not null
        constraint app_user_guardian_pk primary key,
    app_user_id integer not null
        constraint app_user_id_fk references app_user
);

create table if not exists child
(
    id serial not null
        constraint child_pk primary key,
    name varchar(255) not null,
    dob date not null
);

create table if not exists guardian_child
(
    app_user_guardian_id integer not null
        constraint app_user_guardian_id_fk references app_user_guardian,
    child_id integer not null
        constraint child_id_fk references child
);

create table if not exists status
(
    id serial not null
            constraint status_pk primary key,
    status varchar(20) not null
);

create table if not exists available_dates
(
    id serial not null
        constraint available_dates_pk primary key,
    available_date_time timestamp not null default current_timestamp,
    app_user_nursery_id integer not null
        constraint app_user_nursery_id_fk references app_user_nursery,
    status_id integer not null
        constraint status_id_fk references status
);

create table if not exists nursery_child_date_available_request
(
    id serial not null
        constraint nursery_child_date_available_request_pk primary key,
    request_date_time timestamp not null default current_timestamp,
    child_id integer not null
        constraint child_id_fk references child,
    available_dates_id integer not null
        constraint available_dates_id_fk references available_dates,
    status_id integer not null
        constraint status_id_fk references status
);








