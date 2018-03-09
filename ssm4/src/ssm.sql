drop database if exists ssm;
create database ssm character set utf8;
use ssm;

create table dept(
	dept_id int primary key auto_increment,
	dept_name varchar(20),
	dept_address varchar(20)
);

insert into dept(dept_name,dept_address) values('行政部','帝都');
insert into dept(dept_name,dept_address) values('秘书部','成都');
insert into dept(dept_name,dept_address) values('市场部','上海');
select * from dept;