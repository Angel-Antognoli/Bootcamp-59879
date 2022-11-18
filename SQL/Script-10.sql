select 
concat(tipoDocumento,'-',documento) as numeroDocumento,
upper(razonSocial) as nombre,
FechaNacimiento as `Fecha Nacimiento`,
floor((datediff( now(),FechaNacimiento)/365)) as 'Edad del Cliente'
from clientes;



select 
Precio,
Precio*1.5
from productos
