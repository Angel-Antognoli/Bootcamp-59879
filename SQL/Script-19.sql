-- cifrado
use sistemaadministrativo;
create table if not exists usuarios
(
	correo varchar(100) primary key,
	clave blob not null
);

insert into usuarios(correo,clave)
values ( 'user3@gmail.com' , AES_ENCRYPT('hola esta es mi clave',CONCAT('BootcampJava2022','user3@gmail.com')))


select *, AES_DECRYPT(CLAVE,CONCAT('BootcampJava2022',correo) ) from usuarios u 

truncate table usuarios;

