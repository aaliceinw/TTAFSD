use tta;

/* create table using 'auto_increment': increment by 1 */
create table employee(
eid int primary key auto_increment,
firstName varchar(100),
lastName varchar(100),
salary double
);

insert into employee(firstName , lastName , salary) 
values('Ava' , 'Lee' , 1200.00);
insert into employee(firstName , lastName , salary) 
values('Eric' , 'Qi' , 1500.00);
insert into employee(firstName , lastName , salary) 
values('V' , 'W' , 1500.00);

select * from employee;

/* to get total records */
select count(eid) from employee;

/* to get max / min salary */
select max(salary) from employee;
select max(salary) as MSalary from employee;

/* to get average of salary */
select avg(salary) from employee;
select avg(salary) as ASalary from employee;

/* subquery: to get record of employee with max salary */
select * from employee where salary=(select max(salary) from employee);

/*========================*/

/* department table */
create table dept(
did int primary key auto_increment,
dname varchar(100),
eid int,
foreign key (eid) references employee(eid)
);

insert into dept(dname,eid) values('bio' , 2);
select * from dept;

/* error: can not add as eid=5 not exist in employee */
insert into dept(dname,eid) values('bio' , 5);







