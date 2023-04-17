import java.util.Comparator;


public class ArbolRedBlack<T extends Comparable<T>> implements IEstructuraArbol<T>{

    private RedBlackSearchTree<T> myTree;

    public ArbolRedBlack(){
        myTree = new RedBlackSearchTree<T>();
    }

    @Override
    public void add(T value){
        myTree.add(value);
    }

    @Override
    public T get(){

    }

    @Override
    public T remove(){

    }

    @Override
    public int count(){

    }

    @Override
    public boolean isEmpty(){

    }

}