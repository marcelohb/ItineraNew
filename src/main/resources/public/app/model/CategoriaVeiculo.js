Ext.define('ItineraJS.model.CategoriaVeiculo', {
    extend: 'Ext.data.Model',
    alias: 'model.CategoriaVeiculo',
    fields: [ 
    	{name:'idCategoria', type: 'int'},
    	{name:'descricao', type: 'string'},
    	{name:'ehReboque', type: 'string'}
	]
});