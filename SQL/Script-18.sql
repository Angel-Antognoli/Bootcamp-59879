-- CRUD D  -> ABMC B

delete from productos 
where Cant is null

create table if not exists cursos(

	id bigint auto_increment primary key,
	descripcion varchar(100)

);

insert into cursos (descripcion) 
values
('Java SE'),
('JS'),
('Pythn');

select * from cursos;
-- DML  Registras las filas que borro
delete from cursos; -- no hay where 
-- DDL No registra "(drop and create)"
truncate table cursos;

-- reinciar autoincrement
alter table cursos auto_increment = 10;

