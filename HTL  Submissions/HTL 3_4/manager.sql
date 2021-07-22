use prj1;

/*create table called manager*/
create table manager(
mid int primary key,
name varchar (100),
shift varchar(100),
salary double
);

/*insert data into database*/
insert into manager( mid, shift, name, salary) 
values('1', '1' , 'Lenny', 1200.00);
insert into manager( mid, shift, name, salary)
values('2', '2' , 'Cindy', 1350.00);
insert into manager( mid, shift, name, salary) 
values('3', '2' , 'Jameena', 1400.00);
insert into manager( mid, shift, name, salary) 
values('4','3' , 'Mathew', 1600.00);
insert into manager( mid, shift, name, salary) 
values('5','1' , 'Yolande', 1200.00);
insert into manager( mid, shift, name, salary) 
values('6', '3' , 'Jamie', 1700.00);
insert into manager( mid, shift, name, salary) 
values('7', '1' , 'Benjamin', 1200.00);
insert into manager( mid, shift, name, salary) 
values('8', '1' , 'Timothy', 1250.00);
insert into manager( mid, shift, name, salary) 
values('9', '3' , 'Earl', 1500.00);
insert into manager( mid, shift, name, salary) 
values('10','2' , 'Sandra', 1350.00);
insert into manager( mid, shift, name, salary) 
values('11','1' , 'Lesley', 1100.00);
insert into manager( mid, shift, name, salary) 
values('12','1' , 'Kai', 1000.00);
insert into manager( mid, shift, name, salary) 
values('13','2' , 'Nthabi', 1350.00);
insert into manager( mid, shift, name, salary) 
values('14', '3' , 'Amanda', 1650.00);
insert into manager( mid, shift, name, salary) 
values('15', '2' ,'Jimmy',1300.00);

/*display avg salary of manager*/
select * from manager;
select avg(salary) from manager;
