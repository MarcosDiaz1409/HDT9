package clases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import structure5.RedBlackSearchTree;


class ArbolRedBlackTest<T extends Comparable<T>> {

	  @Test
	  public void testAdd(){
		  
		  RedBlackSearchTree<String> tree = new RedBlackSearchTree<>();

		  tree.add("Hombre");
		  tree.add("Mujer");
		  tree.add("Lapiz");
		  tree.add("Pueblo");
		  tree.add("Palabra");
		  assertFalse(tree.isEmpty());
		   
	  }
	  
	  @Test
	  public void testGet(){
		  
	    RedBlackSearchTree<String> tree = new RedBlackSearchTree<>();

	    tree.add("Mesa");
	    assertEquals("Mesa", tree.get("Mesa")); 

	    tree.add("Puerta");
	    assertEquals("Puerta", tree.get("Puerta"));

	  }
	  
	  

}
