create view view_Ventas_vendedor_por_anio
as
select 
vxv.TipoDocumento,
vxv.Documento,
vend.RazonSocial,
vxv.anio,
vxv.cantidad,
vxv.total,
vxv.rendimiento 
from 
(
	select 
	vta.TipoDocumento , 
	vta.Documento ,
	year(vta.Fecha) as anio,
	count(*) as cantidad,
	sum(vta.Monto) as total,
	case 
		when sum(vta.Monto) < 500 then 'Bajo'
		when (sum(vta.Monto) >= 500 and sum(vta.Monto) < 1000) then 'Alto'
		else 'Supero Espectativas'
	end as rendimiento
	from ventas as vta
	group by vta.TipoDocumento , vta.Documento ,year(vta.Fecha)
) as vxv
inner join vendedores as vend on (vxv.TipoDocumento = vend.TipoDocumento  and vxv.Documento = vend.Documento)

