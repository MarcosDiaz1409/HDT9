import java.util.*;
import javax.xml.parsers.FactoryConfigurationError;

import clases.IStructureTree;

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
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nEscribe el tipo de arbol que quieres usar\n");
        System.out.println("1. Arbol Binario   2. Arbol Splay   3. Arbol RedBlack");
        String type = teclado.nextLine();

        TreeFactory<Palabra> factory = new TreeFactory<>();
        IStructureTree<Palabra> arbol = factory.createTree(type);

        Association<Palabra> association = new Association<>(type);
        arbol = association.buildTree(lineasArchivo);
        System.out.println("\nEl arbol solicitado se ha creado");

        // Traduccion del archivo de entrada
        ArrayList<String> lineasTrad = new ArrayList<>();

        File file1 = new File("C:/Ejemplos/traduccion.txt"); // Poner aqui la direccion del archivo de texto a utilizar
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file1))){
                while(br.ready()) {
                    lineasTrad.add(br.readLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<String> newTrad = new ArrayList<String>();
        for(String word : lineasTrad){
            newTrad.add(word.toLowerCase());
        }

        System.out.println("\n>>> Texto a traducir:");
        for(int i = 0; i < newTrad.size(); i++) {
            System.out.println(newTrad.get(i));
        }

        System.out.println("\n>>> Texto traducido: ");
        StringBuilder nuevaFrase = new StringBuilder();
        String[] palabras = newTrad.get(0).split("\\s+");

        for (String palabra : palabras) {
            Palabra p = arbol.get(new Palabra(palabra, ""));
            if (p != null) {
                nuevaFrase.append(p.getSpanish()).append(" ");
            } else {
                nuevaFrase.append(palabra).append(" ");
            }
        }

        System.out.println(nuevaFrase.toString() + "\n");

    }
       
}
