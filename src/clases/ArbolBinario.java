package clases;

import structure5.BinarySearchTree;
import java.util.*;

/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #9
 * 17/04/2023
 * Clase que instancia un BinarySearchTree
 */

public class ArbolBinario<T extends Comparable<T>> implements IStructureTree<T>{
    
    private BinarySearchTree<T> miInternalTree;

    public ArbolBinario() {
        miInternalTree = new BinarySearchTree<T>();
    }

	public ArbolBinario(Comparator<T> comparador) {
        miInternalTree = new BinarySearchTree<T>(comparador);
    }

    @Override
	public void add(T value) {
		miInternalTree.add(value);
		
	}

	@Override
	public T get(T key) {
		return miInternalTree.get(key);
	}

	@Override
	public T remove(T key) {
		return miInternalTree.remove(key);
	}

	@Override
	public int count() {
		return miInternalTree.size();
	}

	@Override
	public boolean isEmpty() {
		return miInternalTree.isEmpty();
	}
	
	public BinarySearchTree<T> getInternalTree(){
		return miInternalTree;
	}

}