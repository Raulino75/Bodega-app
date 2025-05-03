package bodega.modelo;


import bodega.vista.*;
import java.util.ArrayList;

public class ListaObjetos {

    ArrayList<Objetos> ListaObjetos = new ArrayList<>();

    public void agregarObjetos() {

        System.out.println("Ingrese el nombre del producto");
        String nombre = Vista.ingresarTexto();

        System.out.println("Ingrese la cantidad del producto");
        int cantidad = Vista.ingresarEntero();

        ListaObjetos.add(new Objetos(nombre, cantidad));
    }

    public void venderObjetos() {
        Vista.mostrarTexto("Ingrese el nnombre del producto que va a vender:");
        String nombreVenta = Vista.ingresarTexto();

        Vista.mostrarTexto("Ingrese la cantidad del producto que va a vender: ");
        int cantidadVenta = Vista.ingresarEntero();

        boolean encontrar = false;

        for (Objetos objeto : ListaObjetos) {
            if (objeto.getNombre().equalsIgnoreCase(nombreVenta)) {
                encontrar = true;
                if (objeto.getCantidad() >= cantidadVenta) {

                    objeto.setCantidad(objeto.getCantidad() - cantidadVenta);
                    Vista.mostrarTexto("Venta realizada exactamete ");

                } else {
                    Vista.mostrarTexto("No hay suficientes cantidades disponibles");
                }
                break;

            }

        }
        if (!encontrar) {
            Vista.mostrarTexto("El producto no está en el innvenntario");

        }

    }

    public void eliminarObjetos() {

        Vista.mostrarTexto("Ingrese el producto que desea eliminar");
        String nombre = Vista.ingresarTexto();

        ListaObjetos.removeIf(objeto -> objeto.getNombre().equalsIgnoreCase(nombre));

    }

    public void verObjetos() {
        for (Objetos objeto : ListaObjetos) {
            Vista.mostrarTexto("Producto: " + objeto.getNombre() + " Cantidad: " + objeto.getCantidad());

        }

    }
}