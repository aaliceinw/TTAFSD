/*1. Create Database*/
create database tta;
/*2. Delete Database*/
drop database tta;
/*-----------------------------*/

use tta;
/*3. create Table*/
CREATE TABLE student (
    sid INT,
    firstName VARCHAR(100),
    lastName VARCHAR(100)
);
/*column name: _sid ,  s_id, SID. sID
s id -> not ok
*/

SELECT 
    *
FROM
    student;

/*5. Insert data into table*/
insert into student(sid , firstName , lastName) values(101 , 'Ava' , 'Lee');
insert into student(sid , firstName , lastName) values(102 , 'Eric' , 'Qi');

/* Adding Primary key (PK) to table*/
/* remove table(structure + data) from database*/
drop table student;
CREATE TABLE student (
    sid INT,
    firstName VARCHAR(100),
    lastName VARCHAR(100),
    PRIMARY KEY (sid)
);
/*create table student(sid int primary key, firstName varchar(100), lastName varchar(100));*/

/* using 'where' */
/* where in select */
select * from student where sid=101;
select * from student where firstName='Ava';
select * from student where sid > 101;
select * from student where sid=101 and firstName='Eric';
select * from student where sid=101 or firstName='Eric';
select * from student where sid=101 or firstName='Bella';

/*6. Update table*/
update student set lastName = 'LeeFan' where sid = 101;

/*7. Delete table*/
/* just delete data, structure will be in database*/
/* delete particular record*/
delete from student where sid=101;

/* delete all data - if no PK*/
delete  from student;

/* display data by column */
select * from student;
select firstName , lastName from student;

/* Alter table : adding new column*/
alter table student add score int;
select * from student;

update student set score = 89 where sid = 101;
select * from student;

update student set score = 95 where sid = 102;
select * from student;

insert into student(sid , score) values(103 , 78);
select * from student;

insert into student(sid , score) values(104 , 91);
select * from student;

/* Sort table by score*/
select * from student order by score;
select * from student order by score asc;
select * from student order by score desc;

/* display record between the range */
select * from student where score between 90 and 100;

update student set firstName = 'Meera' , lastName = 'J' where sid = 103; 
select * from student;

update student set firstName = 'Raj' , lastName = 'Nair' where sid = 104; 
select * from student;

/* error : duplicate sid */
insert into student(sid , firstName , lastName , score) values(104 , 'V' , 'W' , 80);










