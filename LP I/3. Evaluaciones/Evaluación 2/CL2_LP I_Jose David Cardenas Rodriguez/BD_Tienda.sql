create database Tienda;
use Tienda;
create table Cliente
(
idcliente int primary key not null ,
nomcliente varchar(25) not null,
direccion varchar (25),
iddistrito varchar (25)
);
desc Cliente;

select * from Cliente;
insert into Cliente values (01, 'Alejandro Perez', 'Jr. Mayolo 450', 12);
insert into Cliente values (02,'Milagros Quispes', 'Av. Benavides 890', 22);
insert into Cliente values (03,'Juan Romero', 'Av. Grau 887', 34);
insert into Cliente values (04,'Raul Meza', 'Jr. Hernandez 409', 44);
insert into Cliente values (05,'Moises Fereyro', 'Jr. Jaime Alva 333', 32); 
insert into Cliente values (06, 'Roberto Ramirez', 'Av. Benavides 321', 22);


create table Venta
(
idventa int primary key not null,
idcliente int not null,
total double 
);
desc Venta;

alter table Venta add foreign key (idcliente) references Cliente(idcliente);
desc Venta;

select * from Venta;
insert into Venta values (0112, 01, 56.40);
insert into Venta values (0113, 02, 130.00);
insert into Venta values (0114, 03, 27.35);
insert into Venta values (0115, 04, 210.50);
insert into Venta values (0116, 05, 34.00); 
insert into Venta values (0117, 06, 140.30);

