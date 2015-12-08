Ext.define('ItineraJS.view.main.Main', {
    extend: 'Ext.container.Container',
    requires: [
        'ItineraJS.view.main.MainController',
        'ItineraJS.view.main.MainModel',
        'ItineraJS.view.lista.Lista',
        'ItineraJS.view.categoriaVeiculo.CategoriaVeiculo'
    ],

    xtype: 'app-main',
    
    controller: 'main',
    viewModel: {
        type: 'main'
    },

    layout: {
        type: 'border'
    },

    items: [{
        xtype: 'panel',
        bind: {
            title: '{name}'
        },
        region: 'west',
        html: '<ul><li>M E N U</li></ul>',
        width: 250,
        split: true,
        tbar: [{
            text: 'Button',
            handler: 'onClickButton'
        }]
    },{
        region: 'center',
        xtype: 'tabpanel',
        items:[{
            title: 'Categoria Veículo',
            xtype: 'lista',
            title: 'Categoria de Veículo'
        },{
            // title: 'Categoria Veículo',
            xtype: 'categoriaVeiculo',
            title: 'Veículo' 
        }]
    }]
});
