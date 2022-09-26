create database bdpersonal;
create table persona
(
codigo int primary key auto_increment,
nombre varchar(50),
sueldo decimal(8,2)
);

insert into persona (nombre,sueldo) values ('Camila Cabello', 7500);
insert into persona (nombre,sueldo) values ('the Weeknd', 8500);
select * from persona;
desc persona