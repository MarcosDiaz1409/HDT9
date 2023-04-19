import clases.ArbolRedBlack;
import clases.ArbolSplay;
import clases.ArbolBinario;
import clases.IStructureTree;
import java.util.*;
import java.io.*;

/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #9
 * 19/04/2023
 * Clase principal donde el usuario interactua con el programa
 */

public class DriverProgram {
    
    public static void main(String[] args){
       
        // Se crea el ArrayList que almacena todas las lineas del archivo
        ArrayList<String> lineasArchivo = new ArrayList<>();

        // Lee el archivo de texto y agrega todas las lineas al ArrayList anterior
        File file = new File("C:/Ejemplos/ejemploHDT7.txt"); // Poner aqui la direccion del archivo de texto a utilizar
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file))){
                while(br.ready()) {
                    lineasArchivo.add(br.readLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Muestra los elementos del archivo
        System.out.println("\nDiccionario: \n");
        for(int i = 0; i < lineasArchivo.size(); i++) {
            System.out.println(lineasArchivo.get(i));
        }

        // Creacion del arbol
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEscribe el tipo de arbol que quieres usar\n");
        System.out.println("1. Arbol Binario   2. Arbol Splay   3. Arbol RedBlack");
        String type = scanner.nextLine();

        TreeFactory<String> factory = new TreeFactory<>();
        IStructureTree<String> arbol = factory.create(type);



    }
}
