package clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import structure5.RedBlackSearchTree;
import structure5.SplayTree;

class ArbolSplayTest {

	@Test
	void testAdd(){
		
		SplayTree<String> tree = new SplayTree<>();
	    tree.add("Hombre");
	    tree.add("Mujer");
	    tree.add("Lapiz");
	    tree.add("Pueblo");
	    tree.add("Palabra");
	    assertFalse(tree.isEmpty());
		
	}
	
	@Test
	void testGet(){
		
		RedBlackSearchTree<String> tree = new RedBlackSearchTree<>();

	    tree.add("Mesa");
	    assertEquals("Mesa", tree.get("Mesa")); 

	    tree.add("Puerta");
	    assertEquals("Puerta", tree.get("Puerta"));
		
	}

}
