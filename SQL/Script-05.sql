# insert (C y A) CRUD ABM 
-- PRIMERA OPCION
insert into alumnos 
(
	tipo_documento,
	numero_documento,
	nombre,
	apellido,
	fecha_nacimiento,
	fecha_creacion,
	activo,
	correo,
	sexo,
	id_pais,
	id_provincia
)
values 
(
	'',
	'01',
	'Octavio',
	'Robleto',
	'1983-03-15', -- 19830315
	'2022-11-15 19:22:50',
	1,
	'octavio.robleto@gmail.com',
	'M',
	5,
	1818
);

-- SEGUNDA OPCION
# insert (C y A) CRUD ABM 

insert into alumnos 
(
	# tipo_documento, No lo envio
	numero_documento,
	nombre,
	apellido,
	fecha_nacimiento,
	fecha_creacion,
	activo,
	correo,
	sexo,
	id_pais,
	id_provincia
)
values 
(
	# 'DNI', No lo envio 
	'01',
	'1983-03-15',
	'Robleto',
	'1983-03-15', -- 19830315
	'2022-11-15 19:22:50',
	1,
	'octavio.robleto@gmail.com',
	'', -- VACIO 
	5,
	1818
);



-- TERCERA OPCION
# insert (C y A) CRUD ABM 

insert into alumnos 
(
	numero_documento,
	nombre,
	apellido,
	fecha_nacimiento,
	fecha_creacion,
	activo,
	correo,
	id_pais,
	id_provincia
)
values 
(
	'01',
	'1983-03-15',
	'Robleto',
	'1983-03-15', -- 19830315
	'2022-11-15 19:22:50',
	1,
	'octavio.robleto@gmail.com',
	5,
	1818
);


-- CUARTA OPCION ERROR AL NO MANDAR CAMPO OBLIGATORIO
insert into alumnos 
(
	nombre,
	apellido,
	fecha_nacimiento,
	fecha_creacion,
	activo,
	correo,
	id_pais,
	id_provincia
)
values 
(
	'1983-03-15',
	'Robleto',
	'1983-03-15', -- 19830315
	'2022-11-15 19:22:50',
	1,
	'octavio.robleto@gmail.com',
	5,
	1818
);



-- INSERTAR IMPLICITAMENTE
-- JAVA O SCRIPT PROGRAMAS EN LA BASE (PROCEDIMIENTOS ALMACENADOS - DESENCADENADORES, FUNCIONES )
insert into alumnos 
values 
(
	'',
	'01',
	'Octavio',
	'Robleto',
	'1983-03-15', -- 19830315
	'2022-11-15 19:22:50',
	1,
	'octavio.robleto@gmail.com',
	'M',
	5
);


-- alter table alumnos add column borrado boolean not null;

insert into alumnos 
(
	tipo_documento,
	numero_documento,
	nombre,
	apellido,
	fecha_nacimiento,
	fecha_creacion,
	activo,
	correo,
	sexo,
	id_pais,
	id_provincia
)
values 
(
	'',
	'01',
	'Octavio',
	'Robleto',
	'1983-03-15', -- 19830315
	'2022-11-15 19:22:50',
	1,
	'octavio.robleto@gmail.com',
	'M',
	5,
	1818
);













