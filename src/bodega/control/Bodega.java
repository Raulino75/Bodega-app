package bodega.control;

import bodega.modelo.ListaObjetos;
import bodega.vista.*;


public class Bodega {

    public static void main(String[] args) {
        ListaObjetos lista = new ListaObjetos();
        boolean salir = false;

        while (!salir) {
            Vista.mostrarTexto("Seleccione una de las siguientes opciones:");
            Vista.mostrarTexto("1. Agregar un producto");
            Vista.mostrarTexto("2. Vender un producto");
            Vista.mostrarTexto("3. Eliminar un producto");
            Vista.mostrarTexto("4. Ver productos en la bodega");
            Vista.mostrarTexto("5. Salir");

            int opcion = Vista.ingresarEntero();

            switch (opcion) {
                case 1:
                    
                    lista.agregarObjetos();
                    Vista.mostrarTexto("Se está agregando un producto al inventario");
                    break;

                case 2:
                    
                    lista.venderObjetos();
                    Vista.mostrarTexto("Se está realizando la venta del producto seleccionado");
                    break;

                case 3:
                    
                    lista.eliminarObjetos();
                    Vista.mostrarTexto("Se está eliminando un producto");
                    break;

                case 4:
                    Vista.mostrarTexto("Estos son los productos que se encuentran en la bodega:");
                    lista.verObjetos();
                    break;

                case 5:
                    Vista.mostrarTexto("Saliendo del programa");
                    salir = true;
                    break;

                default:
                    Vista.mostrarTexto("Opción no válida. Por favor, ingrese una opcion valida");
                    break;
            }
        }
    }
}