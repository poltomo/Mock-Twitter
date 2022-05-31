insert into Location(id, name) values(1, 'California, United States of America');
insert into Location(id, name) values(2, 'Montana, United States of America');
insert into Location(id, name) values(3, 'Oregon, United States of America');

insert into Users(id, firstname, lastname, location_id, email) values(1, 'Desiderius', 'Erasmus', 1, 'delmo@gmail.com');
insert into Users(id, firstname, lastname, location_id, email) values(2, 'William', 'Kelvin', 2, 'wkelvin@gmail.com');
insert into Users(id, firstname, lastname, location_id, email) values(3, 'tlig', 'gnol', 3, 'tgnol@gmail.com');

insert into Post(id, postdate, user_id, details) values(1, CURRENT_TIMESTAMP(), 1, 'Very good post');
insert into Post(id, postdate, user_id, details) values(2, CURRENT_TIMESTAMP(), 2, 'A rainy day');
insert into Post(id, postdate, user_id, details) values(3, CURRENT_TIMESTAMP(), 3, 'nice tutorials');