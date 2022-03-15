create database BDtransportes;
use BDtransportes;

drop table tblVehiculo;
create table tblVehiculo (
id int primary key auto_increment,
placa varchar(10) not null,
marca varchar(60) not null,
modelo varchar(5) not null,
valorComercial double not null);

alter table tblvehiculo AUTO_INCREMENT=1;

select * from tblVehiculo;


create table tblRuta (
id int primary key,
origen varchar(45) not null,
destino varchar(45) not null,
valorTicket double not null);

describe tblVehiculo;