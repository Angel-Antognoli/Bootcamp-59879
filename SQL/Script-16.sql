

select 
concat(vend.TipoDocumento, '-',vend.Documento) as documento_vendedor,
vend.RazonSocial as razonsocial_vendedor,
concat(sup.TipoDocumento,'-',sup.Documento) as documento_supervisor,
sup.RazonSocial as razonsocial_supervisor
from vendedores as vend
inner join vendedores as sup on 
(vend.TipoDocumento_Sup = sup.TipoDocumento  and vend.Documento_Sup = sup.Documento)