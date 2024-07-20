create table subscription (id int(11)primary key,sub_name varchar(23),duration varchar(23),sub_status varchar(34),payment int(46),address varchar(23));
insert into subscription values(1,"vishnu","1month","active",200,"wnp"),
(2,"shrinath","2month","inactive",300,"hyd"),
(3,"pradeep","3month","active",400,"ecil");
create table reservation(id int(11)primary key,rev_date varchar(23)not null,rev_port int(12),rev_name varchar(23));
insert into reservation values(1,"1may",2,"vishnu"),
(2,"1june",3,"pradeep"),
(3,"1july",4,"shrinath");

