SET timezone = 'UTC';
SET datestyle = dmy;

insert into address(address, city, postcode) values ('1 New Street', 'Newark', 'SW2 9YH');
insert into address(address, city, postcode) values ('2 Roman Lane', 'Sicily', 'IT2 7GP');
insert into address(address, city, postcode) values ('3 Hells Kitchen', 'New York', 'HG2 4FL');
insert into address(address, city, postcode) values ('4 Spanish Harlem', 'San Juan', 'TR4 9UI');
insert into address(address, city, postcode) values ('2 New Street', 'Newark', 'SW2 9YH');
insert into address(address, city, postcode) values ('3 Roman Lane', 'Sicily', 'IT2 7GP');
insert into address(address, city, postcode) values ('4 Hells Kitchen', 'New York', 'HG2 4FL');
insert into address(address, city, postcode) values ('5 Spanish Harlem', 'San Juan', 'TR4 9UI');

insert into app_user(name, email, password, contact_number, address_id)
    values('Nursery 1', 'nursery1@mail.com', 'Password123', '02880576923', 1);
insert into app_user(name, email, password, contact_number, address_id)
    values('Nursery 2', 'nursery2@mail.com', 'Password123', '02880198564', 2);
insert into app_user(name, email, password, contact_number, address_id)
    values('Nursery 3', 'nursery3@mail.com', 'Password123', '02880340957', 3);
insert into app_user(name, email, password, contact_number, address_id)
    values('Nursery 4', 'nursery4@mail.com', 'Password123', '02880076454', 4);
insert into app_user(name, email, password, contact_number, address_id)
    values('Tony Soprano', 'tsoprano@mail.com', 'Password123', '0975839284', 5);
insert into app_user(name, email, password, contact_number, address_id)
    values('Vito Corleone', 'vcorleone@mail.com', 'Password123', '6985769804', 6);
insert into app_user(name, email, password, contact_number, address_id)
    values('Henry Hill', 'hhill@mail.com', 'Password123', '9867433982', 7);
insert into app_user(name, email, password, contact_number, address_id)
    values('Carlito Brigante', 'cbrigante@mail.com', 'Password123', '4783989750', 8);

insert into app_user_nursery(app_user_id) values (1);
insert into app_user_nursery(app_user_id) values (2);
insert into app_user_nursery(app_user_id) values (3);
insert into app_user_nursery(app_user_id) values (4);
insert into app_user_guardian(app_user_id) values (5);
insert into app_user_guardian(app_user_id) values (6);
insert into app_user_guardian(app_user_id) values (7);
insert into app_user_guardian(app_user_id) values (8);

insert into child(name, dob) values('Anthony Soprano', TIMESTAMP '12/02/2021');
insert into child(name, dob) values('Michael Corleone', TIMESTAMP '30/06/2020');
insert into child(name, dob) values('Harry Hill', TIMESTAMP '01/10/2020');
insert into child(name, dob) values('Carl Brigante', TIMESTAMP '19/08/2019');

insert into guardian_child(app_user_guardian_id, child_id) values(1, 1);
insert into guardian_child(app_user_guardian_id, child_id) values(2, 2);
insert into guardian_child(app_user_guardian_id, child_id) values(3, 3);
insert into guardian_child(app_user_guardian_id, child_id) values(4, 4);

insert into available_dates(available_date_time, app_user_nursery_id, status_id) values('04/09/2023 09:30:00', 4, 1);

insert into nursery_child_date_available_request(request_date_time, child_id, available_dates_id, status_id) values(TIMESTAMP '20/08/2023 10:00:01', 1, 1, 3);
insert into nursery_child_date_available_request(request_date_time, child_id, available_dates_id, status_id) values(TIMESTAMP '01/08/2023 11:00:01', 2, 1, 3);
insert into nursery_child_date_available_request(request_date_time, child_id, available_dates_id, status_id) values(TIMESTAMP '11/08/2023 12:00:01', 3, 1, 3);
insert into nursery_child_date_available_request(request_date_time, child_id, available_dates_id, status_id) values(TIMESTAMP '31/08/2023 13:00:01', 4, 1, 3);
insert into nursery_child_date_available_request(request_date_time, child_id, available_dates_id, status_id) values(TIMESTAMP '20/08/2023 14:00:01', 1, 1, 3);
insert into nursery_child_date_available_request(request_date_time, child_id, available_dates_id, status_id) values(TIMESTAMP '01/08/2023 15:00:01', 2, 1, 3);
insert into nursery_child_date_available_request(request_date_time, child_id, available_dates_id, status_id) values(TIMESTAMP '11/08/2023 16:00:01', 3, 1, 3);
insert into nursery_child_date_available_request(request_date_time, child_id, available_dates_id, status_id) values(TIMESTAMP '31/08/2023 17:00:01', 4, 1, 3);