Ext.define('ItineraJS.view.lista.Lista', {
    extend: 'Ext.grid.Panel',
    xtype: 'lista',
    controller: 'lista',
    viewModel: {
        type: 'lista'
    },
    title: 'categoriaVeiculoGrid',
    controller: 'lista',

    reference:'meuGrid',
    
    columns: [{
            text: 'ID',
            sortable: false,
            hideable: false,
            dataIndex: 'id'
        },{
            text: 'Descrição',
            sortable: false,
            hideable: false,
            dataIndex: 'descricao'
    }],

    bind: {
        store: '{categoriaVeiculoStore}'
    }
});