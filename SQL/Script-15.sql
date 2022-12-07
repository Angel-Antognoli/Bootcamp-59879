select 
pro.*,
coalesce(cat.descripcion,cat.id_categoria,'No posee categoria asociada')


from productos as pro
left join categorias as cat on (pro.Id_Categoria = cat.Id_Categoria)
-- where cat.Descripcion is null;

select * from productos p 
where Id_Categoria not in (select Id_Categoria from categorias c)



select 
pro.*,cat.descripcion

from productos as pro
right join categorias as cat on (pro.Id_Categoria = cat.Id_Categoria)



select * from categorias c 
where Id_Categoria not in (select distinct Id_Categoria from productos p)



