Ext.define('ItineraJS.view.categoriaVeiculo.CategoriaVeiculoModel', {
    extend: 'Ext.app.ViewModel',
    requires: [
    	'ItineraJS.model.CategoriaVeiculo'
    ],
    alias: 'viewmodel.categoriaVeiculoModel',
    // data: {
    //     name: 'ItineraJS'
    // },
    stores:{
        categoriaVeiculoStore: {
            model: 'ItineraJS.model.CategoriaVeiculo',
            autoLoad: true,
            autoShow: true,
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
