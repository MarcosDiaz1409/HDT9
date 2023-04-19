import clases.ArbolRedBlack;

public class DriverProgram {
    
    public static void main(String[] args){
        ArbolRedBlack<String> arbolPrueba = new ArbolRedBlack<String>();

        arbolPrueba.add("Esta es una prueba");

        System.out.println("cantidad de datos> " + arbolPrueba.count());
    }
}
