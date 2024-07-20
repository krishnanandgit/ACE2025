create database ebox;
use ebox;
 create table chargingstation(id int(12)primary key,ports int(12),power varchar(23),canopy varchar(90),shelter varchar(23));
describe chargingstation;
insert into  chargingstation values(1,2,23,"srinath","home");
select*from chargingstation;
insert into chargingstation value (2,4,24,"pradeep","hostel"),
(3,6,25,"vishnu","room");
select * from  chargingstation;
create table user (id int(11)primary key,name varchar(20),email varchar(23),address varchar(23),phone bigint(10));
describe  user;
insert into user values(1,"vishnu","vishnu@gmail.com","wnp",1234),
(2,"shrinath","shrinath@gamil.com","hyd",3456),
(3,"pradeep","pradeep@gmail.com","ecil",45678);
select *from user;
create table vechile(id int(11)primary key, vec_model varchar(23),vech_number varchar(23));
select * from vechile;
