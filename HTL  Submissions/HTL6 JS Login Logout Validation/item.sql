use prj1;

create table item(
itemid int primary key,
dish varchar (100),
price double,
category varchar(100)
);

/*insert data into item table*/
insert into item(itemid, dish , price, category) values(101 , 'Salmon' , '12', 'Mains');
insert into item(itemid, dish , price, category) values(102 , 'Cake' , '8', 'Dessert');
insert into item(itemid, dish , price, category) values(103 , 'Mussels' , '6', 'Starter');
insert into item(itemid, dish , price, category) values(104 , 'Trifle' , '7', 'Dessert');
insert into item(itemid, dish , price, category) values(105 , 'Prawns' , '9', 'Starter');
insert into item(itemid, dish , price, category) values(106 , 'Steak' , '14', 'Mains');
insert into item(itemid, dish , price, category) values(107 , 'Pizza' , '10', 'Mains');
insert into item(itemid, dish , price, category) values(108 , 'Trifle' , '7', 'Dessert');
insert into item(itemid, dish , price, category) values(109 , 'Olives' , '7', 'Starter');
insert into item(itemid, dish , price, category) values(110 , 'Lasagna' , '10', 'Mains');
insert into item(itemid, dish , price, category) values(111 , 'Mouse' , '6', 'Dessert');
insert into item(itemid, dish , price, category) values(112 , 'Hake' , '11', 'Mains');

/*display dishes served per category*/
Select * from item
order by category, dish;

/*display total number of dishes served*/
select count(dish)
from item
group by category;

select count(dish)
from item;