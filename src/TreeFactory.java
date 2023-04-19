import clases.ArbolRedBlack;
import clases.ArbolSplay;
import clases.IStructureTree;
import clases.ArbolBinario;

public class TreeFactory<T extends Comparable<T>>{

    public IStructureTree<T> create(String type) {
        switch (type) {
            case "Arbol Binario":
                return new ArbolBinario<T>();

            case "Arbol Splay":
                return new ArbolSplay<T>();

            case "Arbol RedBlack":
                return new ArbolRedBlack<T>();

            default:
                throw new IllegalArgumentException("El tipo de arbol no existe");

        }
    }


}