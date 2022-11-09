-- USAR BASE DE DATOS

use bootcamp_java_59879;

-- CREAR TABLAS 
-- 'DNI'
create table if not exists alumnos(
	tipo_documento CHAR(3) not null default 'DNI', -- PAS, DNI, CI , LE 
	numero_documento VARCHAR(15) not null,	
	nombre VARCHAR(60) not null,
	apellido VARCHAR(60) not null,
	fecha_nacimiento date not null,
	fecha_creacion datetime not null,
	activo boolean default 1,
	correo VARCHAR(100),
	observaciones TEXT
);

-- BORRAR TABLA DE LA BASE DE DATOS
drop table if exists alumnos;

-- RENOMBRAR TABLA
-- RENAME TABLE clientes TO alumnos;

-- BORRAR UN CAMPO
alter table alumnos drop column observaciones;

-- AGREGAR UN CAMPO A LA TABLA 
alter table alumnos add column sexo char(1) not null default 'F';


-- MODIFICAR CAMPO
alter table alumnos modify apellido NVARCHAR(100);

-- 
