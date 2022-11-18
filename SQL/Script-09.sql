# FUNCIONES EN MARIADB

-- funciones fecha
select 
datediff('1983-03-15' ,now() ) /30 ,
date_add('2019-01-01', interval 5 day ) 

now(), 
current_time(), 
current_date(), 
year(now()),
month(now()),
day(now()),
hour(now()),
minute(now()),
monthname(now()),
dayofweek(now()),
dayname(now())

-- select * from clientes where FechaNacimiento < current_date() 


-- funciones de cadena de caracteres
select 
concat('Hola',' ','desde','Java'),
'             hola' ,
ltrim('             hola'), 
rtrim('hola                     '),
trim('            hola          '),
upper('hola'),
lower('HOLA'), 
substring('Octavio',2) 

-- funciones matematicas

select ABS(-5), ROUND(5.369,2),ceil(5.00001), floor(5.9999) 

