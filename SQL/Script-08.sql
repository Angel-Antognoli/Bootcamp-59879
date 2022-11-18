# operador logico OR y between 

select 
* 
from productos 
where
precio not between 12 and 20
-- (precio >= 12 and precio <= 20) igual a  precio between 12 and 20
-- precio < 12 or precio > 20 igual a precio not between 12 and 20
or FechaVencimiento between '20180101' and '20190301';

or FechaVencimiento >= '2020-05-25' -- 2020-05-25 03:08:51.000

;


-- listas 
	select 
	*
	from clientes 
	-- DNI y CI
	where TipoDocumento not in ('LE','CI') 
	and FechaNacimiento >= '1999-01-01'
	-- tipoDocumento != 'LE' and  tipoDocumento != 'CI' IGUAL A TipoDocumento not in ('LE','CI') 
	-- tipoDocumento = 'DNI' or tipoDocumento = 'CI' IGUAL a TipoDocumento not in ('DNI','CI')
	
	
# like => contiene
	
	select 
	*
	from clientes 
	where RazonSocial  like '%co%' or correo like '%com%' ; 

-- COMODIN %
-- COMIENZA CON 'PALABRA%'
-- TERMINA CON '%PALABRA'
-- CONTIENE '%PALABRA%'
	select 
	*
	from clientes 
	where Telefono  not like '(___)____-____'


-- COMODIN _
	
	
-- operador expresion regular	
select 
*
from clientes
where correo not regexp '([a-zA-Z0-9]+(\\.?[a-zA-Z0-9])*)+@(([a-zA-Z]+)\\.([a-zA-Z]+))'

-- [a-bA]


-- ordenar
select * from clientes
-- join
-- where 
-- group by
-- having
order by Documento  desc, FechaNacimiento asc 
limit 15 ,5



	



