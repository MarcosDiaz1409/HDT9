import clases.ArbolRedBlack;
import clases.ArbolSplay;
import clases.IStructureTree;
import clases.ArbolBinario;

/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #9
 * 19/04/2023
 * Clase Factory donde se creara el arbol dependiendo de la opcion del usuario
 */

public class TreeFactory<T extends Comparable<T>>{

    public IStructureTree<T> createTree(String type) {
        
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("Arbol Splay")) {
            return new ArbolSplay<T>();
        }
        if (type.equalsIgnoreCase("Arbol RedBlack")) {
            return new ArbolRedBlack<T>();
        }
        if (type.equalsIgnoreCase("Arbol Binario")) {
            return new ArbolBinario<T>();
        }
        return null;

    }

}