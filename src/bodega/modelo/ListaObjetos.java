
package bodega.modelo;

import bodega.vista.vista;
import java.util.ArrayList;


public class ListaObjetos {
    ArrayList<Objetos> ListaObjetos= new ArrayList<>();
    public void agregarObjetos(){
        String nombre = vista.ingresarTexto();
        ListaObjetos.add(nombre);
    }
    public void eliminarObjetos(){
        
    }
    public void verObjetos(){
        
    }
}
