package clases;

/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #9
 * 17/04/2023
 * Interface que contiene los metodos de los arboles de mapeo
 */

public interface IStructureTree<T extends Comparable<T>>{

    // Método para insertar un valor en el árbol
    void add(T value);
    
    // Método para buscar un valor en el árbol
    T get(T key);
    
    // Método para eliminar un valor del árbol
    T remove(T key);
    
    // Método para obtener el número de elementos en el árbol
    int count();
    
    // Método para verificar si el árbol está vacío
    boolean isEmpty();    

}
