package week5_6;

import java.util.ArrayList;

public class Layer {

    ArrayList<Shape> shape = new ArrayList<>();

    public void deleteTriagle (){
        for (int i=0;i<shape.size();i++){
            if (shape.get(i) instanceof Triangle){
                shape.remove(i);
                i--;
            }
        }
    }

}
