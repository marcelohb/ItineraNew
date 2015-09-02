Ext.define('ItineraJS.view.lista.ListaModel', {
	extend: 'Ext.app.ViewModel',
	alias: 'viewmodel.lista',
	requires: ['ItineraJS.model.CategoriaVeiculo'],
	stores: {
		categoriaVeiculoStore : {
			model: 'ItineraJS.model.CategoriaVeiculo',
			autoLoad: true,
			autoSync: true,
			proxy: {
				type: 'ajax',
				url: 'categoriaVeiculo',
				// timeout: 50000,
				reader: {
					type: 'json'
					// ,
					// rootProperty: 'rows'
				}
			}
		}
	}
});