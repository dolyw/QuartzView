drop database springbootquartz;

create database springbootquartz;

use springbootquartz;

create table user (
id int primary key auto_increment COMMENT "ID",
account varchar(20) not null COMMENT "帐号",
password varchar(80) not null COMMENT "密码",
reg_time datetime not null COMMENT "注册时间"
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT "用户表";

insert into user values(null, "admin", "admin", now());
insert into user values(null, "wang", "wang", now());
insert into user values(null, "guest", "guest", now());

