insert into nursery(name, email, password, contact_number, address_id)
    values('Nursery 1', 'nursery1@mail.com', 'Password123', '02880576923', 1);
insert into nursery(name, email, password, contact_number, address_id)
    values('Nursery 2', 'nursery2@mail.com', 'Password123', '02880198564', 2);
insert into nursery(name, email, password, contact_number, address_id)
    values('Nursery 3', 'nursery3@mail.com', 'Password123', '02880340957', 3);
insert into nursery(name, email, password, contact_number, address_id)
    values('Nursery 4', 'nursery4@mail.com', 'Password123', '02880076454', 4);

insert into guardian(name, email, password, contact_number, address_id)
    values('Tony Soprano', 'tsoprano@mail.com', 'Password123', '0975839284', 1);
insert into guardian(name, email, password, contact_number, address_id)
    values('Vito Corleone', 'vcorleone@mail.com', 'Password123', '6985769804', 2);
insert into guardian(name, email, password, contact_number, address_id)
    values('Henry Hill', 'hhill@mail.com', 'Password123', '9867433982', 3);
insert into guardian(name, email, password, contact_number, address_id)
    values('Carlito Brigante', 'cbrigante@mail.com', 'Password123', '4783989750', 4);

insert into child(name, dob) values('Anthony Soprano', '12/02/2021');
insert into child(name, dob) values('Michael Corleone', '31/06/2020');
insert into child(name, dob) values('Harry Hill', '01/10/2020');
insert into child(name, dob) values('Carl Brigante', '19/08/2019');

insert into guardian_child(guardian_id, child_id) values(1, 1);
insert into guardian_child(guardian_id, child_id) values(2, 2);
insert into guardian_child(guardian_id, child_id) values(3, 3);
insert into guardian_child(guardian_id, child_id) values(4, 4);

insert into nursery_child_date_request(date, child_id, nursery_id) values('20/08/2022', 1, 1);
insert into nursery_child_date_request(date, child_id, nursery_id) values('01/08/2022', 2, 1);
insert into nursery_child_date_request(date, child_id, nursery_id) values('11/08/2022', 3, 2);
insert into nursery_child_date_request(date, child_id, nursery_id) values('31/08/2022', 4, 2);
insert into nursery_child_date_request(date, child_id, nursery_id) values('20/08/2022', 1, 3);
insert into nursery_child_date_request(date, child_id, nursery_id) values('01/08/2022', 2, 3);
insert into nursery_child_date_request(date, child_id, nursery_id) values('11/08/2022', 3, 4);
insert into nursery_child_date_request(date, child_id, nursery_id) values('31/08/2022', 4, 4);

insert into nursery_date_available(date, nursery_id) values('31/08/2022', 4);

insert into nursery_date_booked(nursery_date_available_id, nursery_child_date_request_id) values(1, 8);














