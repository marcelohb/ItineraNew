Ext.define('ItineraJS.view.main.Main', {
    extend: 'Ext.container.Container',
    requires: [
        'ItineraJS.view.main.MainController',
        'ItineraJS.view.main.MainModel',
        'ItineraJS.view.lista.Lista'
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
        html: '<ul><li>This area is commonly used for navigation, for example, using a "tree" component.</li></ul>',
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
            title: 'aqui tem um grid'
        }]
    }]
});
