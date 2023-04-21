import clases.IStructureTree;
import java.util.*;

public class Association<T extends Comparable<T>>{

    private IStructureTree<Palabra> tree;

    public Association(String type){

        TreeFactory<Palabra> factory = new TreeFactory<>();
        this.tree = factory.createTree(type);

    }
    
    public void buildTree(ArrayList<String> list) {
        
        for (String line : list) {
            String[] words = line.split(",");
            String english = words[0].trim();
            String spanish = words[1].trim();
            Palabra palabra = new Palabra(spanish, english);
            tree.add(palabra);
        }

        tree.toString();

    }

}