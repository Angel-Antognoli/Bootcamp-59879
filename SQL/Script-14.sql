-- sub consulta correlacionada

use sistemaadministrativo;

select 
PRO.ID,
PRO.Descripcion,
PRO.Precio,
PRO.Cant,
PRO.FechaVencimiento,
PRO.Id_Categoria,
(	
	select -- top (1)
	Descripcion  
	from sistemaadministrativo.categorias as CAT
	where CAT.Id_Categoria = PRO.Id_Categoria  order by 1 desc limit 1 
) as descripcionCategoria
from sistemaadministrativo.productos as PRO