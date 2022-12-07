select 
TipoDocumento,
Documento,
RazonSocial,
sum(total)
from sistemaadministrativo.view_ventas_vendedor_por_anio
group by TipoDocumento,Documento

	select 
	vta.TipoDocumento , 
	vta.Documento ,
	count(*) as cantidad,
	sum(vta.Monto) as total,
	case 
		when sum(vta.Monto) < 500 then 'Bajo'
		when (sum(vta.Monto) >= 500 and sum(vta.Monto) < 1000) then 'Alto'
		else 'Supero Espectativas'
	end as rendimiento
	from ventas as vta
	group by vta.TipoDocumento , vta.Documento 