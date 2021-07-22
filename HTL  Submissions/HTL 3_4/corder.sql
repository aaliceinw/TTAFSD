use prj1;
/*create table corder with foreign key reference in item table*/
create table corder(
corderid int primary key auto_increment,
cname varchar(100),
phone varchar (100),
address varchar(100),
itemid int,
foreign key (itemid) references item(itemid),
qty int,
total double,
date varchar(100)
);


select * from corder;
insert into corder(corderid, cname, phone,address, itemid,qty, total, date)
values('1', 'Hotel1','0123456789', '1 Anytown', '101', '4', 200, '04 Apr 2021');
insert into corder(corderid, cname, phone,address, itemid,qty, total, date)
values('2', 'Hotel2','5678901234', '2 Anytown', '102', '2', 100, '05 Apr 2021');
insert into corder(corderid, cname, phone,address, itemid,qty, total, date)
values('3', 'Hotel3','1234567890', '3 Anytown', '103', '5', 250, '04 Apr 2021');
insert into corder(corderid, cname, phone,address, itemid,qty, total, date)
values('4', 'Hotel1','0123456789', '1 Anytown', '104', '1', 50, '03 Apr 2021');
insert into corder(corderid, cname, phone,address, itemid,qty, total, date)
values('5', 'Hotel2','5678901234', '2 Anytown', '105', '2', 100, '03 Apr 2021');
insert into corder(corderid, cname, phone,address, itemid,qty, total, date)
values('6', 'Hotel3','1234567890', '3 Anytown', '106', '3', 150, '04 Apr 2021');
insert into corder(corderid, cname, phone,address, itemid,qty, total, date)
values('7', 'Hotel1','0123456789', '1 Anytown', '107', '4', 200, '04 Apr 2021');
insert into corder(corderid, cname, phone,address, itemid,qty, total, date)
values('8', 'Hotel2','5678901234', '2 Anytown', '108', '2', 100, '05 Apr 2021');
insert into corder(corderid, cname, phone,address, itemid,qty, total, date)
values('9', 'Hotel3','1234567890', '3 Anytown', '109', '5', 250, '04 Apr 2021');
insert into corder(corderid, cname, phone,address, itemid,qty, total, date)
values('10', 'Hotel1','0123456789', '1 Anytown', '110', '2', 100, '03 Apr 2021');
insert into corder(corderid, cname, phone,address, itemid,qty, total, date)
values('11', 'Hotel2','5678901234', '2 Anytown', '111', '3', 150, '03 Apr 2021');
insert into corder(corderid, cname, phone,address, itemid,qty, total, date)
values('12', 'Hotel3','1234567890', '3 Anytown', '112', '4', 200, '04 Apr 2021');

/*display total amout of order*/
select sum(total) from corder;

/*display number of orders placed per day*/
select date from corder;
select count(itemid)
from corder
group by date;