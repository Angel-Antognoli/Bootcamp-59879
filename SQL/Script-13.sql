-- sub consulta como origen de datos

select * from 

(
	select 
	TipoDocumento, 
	Documento,
	month(Fecha),
	sum(Monto) as 'TotalVentas',
	if(sum(Monto)>5000,'Buen Vendedor','Vendedor Regular') as Clasifica,
	case TipoDocumento
		when 'DNI' then 'Documento Nacional de Identidad'
		when 'PAS' then 'Pasaporte'
	end as Tipo,
	case month(fecha)
		when 	1	then	'Ene'
		when 	2	then	'Feb'
		when 	3	then	'Mar'
		when 	4	then	'Abr'
		when 	5	then	'May'
		when 	6	then	'Jun'
		when 	7	then	'Jul'
		when 	8	then	'Ago'
		when 	9	then	'Sep'
		when 	10	then	'Oct'
		when 	11	then	'Nov'
		else    'Dic'
	end as MesLetras,
	case 
		when sum(Monto) >= 2000 then 'Excelente'
		when sum(monto) > 500 and sum(monto)< 2000 then 'Regular'
		-- when sum(Monto) > 2000 and month(Fecha) = 11 then 'Excelente Noviembre'
		else  'Promedio'
		
	end Claseifi2
	
	from ventas 
	group by TipoDocumento,Documento, month(Fecha)
	order by 
		case 
			when sum(Monto) >= 2000 then 2
			when sum(monto) > 500 and sum(monto)< 2000 then 3
			else  1
		end 

) as ventasVendedores
where MesLetras like 'J%' 