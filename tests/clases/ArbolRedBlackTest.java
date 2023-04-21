package clases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import structure5.Palabra;
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
	  
	  @Test
	  public void test(){
		  
		  RedBlackSearchTree<Palabra> miDiccionario = new RedBlackSearchTree<Palabra>();
			
		  miDiccionario.add(new Palabra("dog", "perro"));
		  miDiccionario.add(new Palabra("house", "casa"));
		  miDiccionario.add(new Palabra("window", "ventana"));
			
		  Palabra miBusqueda = miDiccionario.get(new Palabra("house", ""));
			
		  assertEquals("house", miBusqueda.getEnglish());
		  assertEquals("casa", miBusqueda.getSpanish());
		  
	  }
	  
	  

}
