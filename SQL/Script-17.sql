-- CRUD U  --> ABM M

update productos 
set 
Descripcion = upper(descripcion),
precio = precio * 1.27 ,
Cant = cant - 1,
FechaVencimiento  = date_add(FechaVencimiento, interval 4 year) 
where Id_Categoria  = 3;


select * from productos where Id_Categoria  = 5


