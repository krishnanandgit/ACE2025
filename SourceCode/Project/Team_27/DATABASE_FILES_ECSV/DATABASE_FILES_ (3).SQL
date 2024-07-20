create table payment(id int(11)primary key,p_mode varchar(23), p_name varchar(23)not null, p_number int(34));
insert into payment values(1,"online","vishnu",123),
(2,"ofline","shrinath",345),
(3,"online","pradeep",6958);

create table maintance(id int(11)primary key,m_description varchar(23),m_bill int(34));
insert into maintance values(1,"process",123),
(2,"active",678),
(3,"inactive",890);
 
