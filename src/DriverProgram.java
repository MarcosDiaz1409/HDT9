import clases.ArbolRedBlack;
import clases.ArbolSplay;
import clases.ArbolBinario;

public class DriverProgram {
    
    public static void main(String[] args){
        ArbolRedBlack<String> arbolPrueba = new ArbolRedBlack<String>();
        ArbolSplay<String> arbolPrueba2 = new ArbolSplay<String>();
        ArbolBinario<String> arbolPrueba3 = new ArbolBinario<String>();

        arbolPrueba.add("Esta es una prueba");
        arbolPrueba2.add(" Esta es una prueba para ST");
        arbolPrueba3.add("Esta es una prueba para BST");

        System.out.println("cantidad de datos> " + arbolPrueba.count());
        System.out.println("cantidad de datos" + arbolPrueba2.count());
        System.out.println("cantidad de datos BST: " + arbolPrueba3.count());

    }
}
