
-- CREAR TABLA CON RESTRICCIONES 
-- CLAVE PRIMARIA SIMPLE O COMPUESTA


-- SIMPLE PK
create table if not exists cursos(
	codigo CHAR(5) primary key, -- JVNP1   BD001   00001	
	descripcion VARCHAR(100)
);

-- PK SIMPLE
create table if not exists paises(
	id smallint ,
	descripcion VARCHAR(100),
	primary key (id)
);

-- CAMBIAR EL CAMPO ID
alter table paises modify id smallint auto_increment;


create table if not exists profesores(
	tipo_documento char(3) not null default 'DNI',
	numero_documento varchar(15) not null,
	nombre varchar(100),
	primary key (tipo_documento,numero_documento)
);


-- RESTRICCIONES DE CLAVE FORANEA drop table cursos_profesores
create table cursos_profesores (
	id int auto_increment ,
	codigo_curso char(5),
	tipo_documento char(3),
	numero_documento varchar(15),
	-- fechaAsignacionCurso date
	constraint pk_curso_profesor_1 primary key (id),
	constraint fk_curso_1 foreign key (codigo_curso) references cursos(codigo),
	foreign key (tipo_documento,numero_documento) references profesores (tipo_documento,numero_documento) 
);

-- 1 Buenos Aires, 2 Cordoba ....
create table provincias(
	id smallint auto_increment,
	descripcion varchar(100),
	id_pais smallint,
	primary key(id),
	foreign key(id_pais) references paises (id)
);



