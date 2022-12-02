

select 
Id_Categoria  id,
year(FechaVencimiento) as Anio,
month(FechaVencimiento),
count(*) as cantidad,
sum(precio),
avg(precio),
sum(cant),
max(precio),
min(precio),
group_concat( descripcion)

from productos 
-- JOINS
where FechaVencimiento > '20180101'
group by Id_Categoria , year(FechaVencimiento), month(FechaVencimiento)
having  cantidad > 2   
order by anio desc;





select
count (*),
count(1),
count(10),
count(telefono)
from clientes
