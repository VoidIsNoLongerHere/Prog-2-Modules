import java.util.ArrayList;

public class Tree {
    ArrayList<Pair<Object, ArrayList<Object>>> root;


    public void addToRoot(Pair<Object, ArrayList<Object>> branch){

        //Start object validation
        if (branch.getKey() instanceof Leaflet) {
            for (Object child : branch.getValue()){
                if (!(child instanceof Leaflet)){
                    throw new RuntimeException("Child is not compatible with Tree\n" + child.toString() );
                }
            }
        } else {
            throw new RuntimeException("Root is not compatible with Tree\n" + branch.getKey().toString() );
        }
        //End object validation

        root.add(branch);
    }

    public void print(){
        for (Pair<Object, ArrayList<Object>> branch : root){
            ((Leaflet) branch.getKey()).printSelf();
            for (Object child: branch.getValue()){

            }
        }
    }

    private void printChild(ArrayList<Object> branch){
        for (Object leaf:branch){
            if(leaf.getClass() == String.class)
            if (leaf instanceof Pair<?,?>){
               Pair<Object, ArrayList<Object>> newPair = (Pair<Object, ArrayList<Object>>) leaf;
                 if (((Pair<?, ?>) leaf).getKey() instanceof Leaflet){
                     ((Leaflet) ((Pair<?, ?>) leaf).getKey()).printSelf();
                 }
        }
    }
}



}
