use tta;

/* create table using 'auto_increment': increment by 1 */
create table members(
mid int primary key auto_increment,
firstName varchar(100),
lastName varchar(100),
password varchar(100),
salary double
);

drop table members
create table members(
mid int primary key auto_increment,
firstName varchar(100),
lastName varchar(100),
password varchar(100),
salary double
);

insert into members(firstName , lastName, password, salary) 
values('James' , 'Adams' , 123456, 1200.00);
insert into members(firstName , lastName, password, salary) 
values('Gillian' , 'Roberts' , 234567, 1100.00);
insert into members(firstName , lastName, password, salary) 
values('Henrietta' , 'Miles' , 987654, 1500.00);