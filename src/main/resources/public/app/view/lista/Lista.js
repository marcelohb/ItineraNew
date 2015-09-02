Ext.define('ItineraJS.view.lista.Lista', {
    extend: 'Ext.grid.Panel',
    requires: [
        'ItineraJS.view.lista.ListaController',
        'ItineraJS.view.lista.ListaModel'
    ],
    xtype: 'lista',
    controller: 'lista',
    viewModel: {
        type: 'lista'
    },
    title: 'categoriaVeiculoGrid',

    reference:'meuGrid',
    
    columns: [
        {
            text: 'ID',
            sortable: true,
            hideable: false,
            dataIndex: 'idCategoria'
        },{
            text: 'Descrição',
            sortable: false,
            hideable: false,
            dataIndex: 'descricao',
            flex: 1
        },{
            text: 'Reboque',
            sortable: false,
            hideable: false,
            dataIndex: 'ehReboque'
    }],

    bind: {
        store: '{categoriaVeiculoStore}'
    }
});