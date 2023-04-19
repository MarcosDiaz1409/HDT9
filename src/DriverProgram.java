import clases.ArbolRedBlack;
import clases.ArbolSplay;

public class DriverProgram {
    
    public static void main(String[] args){
        ArbolRedBlack<String> arbolPrueba = new ArbolRedBlack<String>();
        ArbolSplay<String> arbolPrueba2 = new ArbolSplay<String>();

        arbolPrueba.add("Esta es una prueba");
        arbolPrueba2.add(" Esta es una prueba para ST");

        System.out.println("cantidad de datos> " + arbolPrueba.count());
        System.out.println("cantidad de datos" + arbolPrueba2.count());

    }
}
