package clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import structure5.BinarySearchTree;
import structure5.RedBlackSearchTree;

class ArbolBinarioTest {

	@Test
	void testAdd() {
	
		BinarySearchTree<String> tree = new BinarySearchTree<>();
		tree.add("Hombre");
		tree.add("Mujer");
		tree.add("Lapiz");
		tree.add("Pueblo");
		tree.add("Palabra");
		assertFalse(tree.isEmpty());
		
	}
	
	@Test
	public void testGet(){
		  
		BinarySearchTree<String> tree = new BinarySearchTree<>();

		tree.add("Mesa");
		assertEquals("Mesa", tree.get("Mesa")); 

		tree.add("Puerta");
	    assertEquals("Puerta", tree.get("Puerta"));

	}

}
