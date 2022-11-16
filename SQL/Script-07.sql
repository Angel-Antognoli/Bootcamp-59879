# SELECT (R,C) CRUD y ABMC

-- use sistemaadministrativo;
select -- campos
TipoDocumento,
Documento,
RazonSocial,
Correo,
FechaNacimiento,
Telefono
from clientes -- tabla 
-- join 
where 
TipoDocumento  = 'DNI' 
and 
FechaNacimiento > '1998-01-01'
and 
Documento = '20148922'
and 
correo = 'Duis.volutpat.nunc@liberoat.co.uk'



select 
*
from productos
where Cant > 5 and precio > 20 and Id_Categoria = 5




/*
use bootcamp_java_59879;

select * from alumnos where tipo_documento = '';
*/


