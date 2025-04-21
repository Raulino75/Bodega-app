package bodega.vista;

import java.util.Scanner;

public class vista {

    

    public static String ingresarTexto() {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        sc.close();
        return texto;
    }
    public static void mostrarTexto(String texto){
        Scanner sc = new Scanner(System.in);
        texto = sc.nextLine();
    }
    public static int ingresarEntero(){
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();
        return numero;
    }
   
}
