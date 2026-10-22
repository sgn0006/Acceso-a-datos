drop database if exists comercio;
create database comercio;

use comercio;

create table producto (
id_producto int auto_increment primary key,
nombre varchar(30) not null,
categoria varchar(30),
marca varchar(30) not null,
precio decimal (8,2) not null,
stock int default 0
);

create table cliente(
id_cliente int auto_increment primary key,
dni varchar(10) not null,
nombre varchar(30) not null,
email varchar(100),
telefono varchar(9),
direccion varchar(100) not null
);

create table proveedor(
id_proveedor int auto_increment primary key,
nombre varchar(60) not null,
ciudad varchar(60) not null,
telefono varchar(9) 
);

create table compra(
id_compra int auto_increment primary key,
id_proveedor int not null,
id_producto int not null,
fecha date not null,
cantidad int not null,
coste decimal(8,2) not null,
foreign key (id_proveedor) references proveedor(id_proveedor),
foreign key (id_producto) references producto(id_producto)
);

create table venta (
id_venta int auto_increment primary key,
id_cliente int not null,
id_producto int not null,
fecha date not null,
cantidad int not null,
foreign key (id_cliente) references cliente(id_cliente),
foreign key (id_producto) references producto(id_producto)
);

show tables;
describe cliente;

alter table cliente add column telefono varchar(9);
alter table cliente rename column telefono to movil;
alter table cliente modify column movil varchar(15);
alter table cliente drop movil;

insert into cliente(nombre,direccion,ciudad,email)
values ('Juan Lopez', 'C/Andalucia nº2', 'Badajoz', 'juan.lopez@davante.org');

select * from cliente;

insert into proveedor(nombre,ciudad,telefono)
values ('HP', 'Madrid', '90090909901'),
		('Lenovo', 'Madrid', '90090909902'),
        ('Logitech', 'Madrid', '90090909903'),
        ('TechMayorista', 'Madrid', '90090909904');

insert into producto(nombre,categorias,marca,precio,stock)   
values ('Portatil HP 15', 'Portatiles', 'HP', 549.00, 15),
		('Portatil Lenovo IdePad', 'Portatiles', 'Lenovo', 479.00, 20);

insert into venta(id_cliente, id_producto, fecha, cantidad)
values (1, 1, '2026-09-01', 1),
		(1, 2, '2026-09-01', 1);
        
        
insert into clientes values ('x','y','z');

insert into producto (nombre, marca, precio) values ('Raton','Logitech','barato');

insert into venta (id_cliente, id_producto, fecha, cantidad) values (99,1,'2026-10-10',1);

insert into cliente(nombre,email) values ('Marta', 'marta@davante.org');