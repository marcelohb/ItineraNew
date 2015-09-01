Ext.define('ItineraJS.view.lista.ListaController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.lista',

    onChange: function (barTextField) {
        alert("oi")
    },

    onAdd: function() {
    	alert("adicionar")
    }
}); 