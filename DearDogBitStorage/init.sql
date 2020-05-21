CREATE DATABASE deardogbit;
use deardogbit;
create table tmp_user
(
	id int auto_increment,
	name varchar(50) not null,
	sex int null,
	constraint tmp_user_pk
		primary key (id)
);