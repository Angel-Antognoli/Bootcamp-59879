-- AGREGAR A ALUMNOS EL PAIS
-- alter table alumnos drop column id_pais
alter table alumnos add column id_pais smallint;

-- AGREGAR LA CLAVE FORANEA

alter table alumnos add constraint fk_pais foreign key (id_pais) references paises (id); 

alter table alumnos add column id_provincia smallint;

alter table alumnos add foreign key (id_provincia) references provincias (id); 

