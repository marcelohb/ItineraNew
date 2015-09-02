Ext.define('ItineraJS.model.CategoriaVeiculo', {
    extend: 'Ext.data.Store',
    
    model: 'ItineraJS.view.CategoriaVeiculo',
	proxy: {
		type: 'ajax',
		url : '/listar',
		disableCaching: true,
		reader: {
		    type: 'json'
		}
	}
});
