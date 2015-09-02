Ext.define("ItineraJS.view.categoriaVeiculo.CategoriaVeiculo",{
    extend: "Ext.grid.Panel",
    requires: [
    	'ItineraJS.view.categoriaVeiculo.CategoriaVeiculoModel',
    	'ItineraJS.view.categoriaVeiculo.CategoriaVeiculoController'
    ],
    xtype : 'categoriaVeiculo',
    controller : 'categoriaVeiculoController',
    viewModel: {
        type: "categoriaVeiculoModel"
    },
    // controller: "CategoriaVeiculoController",
    bind: {
        store: '{categoriaVeiculoStore}'
    },
    title: 'Categorias de Veículos',
    displayInfo: true,
    columns: [{
        text: 'Id',
        dataIndex: 'idCategoria'
    },{
        text: 'descricao',
        dataIndex: 'descricao',
        flex: 1 
    },{
        text: 'Reboque',
        dataIndex: 'ehReboque'
    }]
});
