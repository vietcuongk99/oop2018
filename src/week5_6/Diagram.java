package week5_6;


import java.util.ArrayList;

public class Diagram {

    ArrayList<Layer> layer = new ArrayList<>();

    public void deleteCircle (){
        for (int i=0;i<layer.size();i++){
            for (int j=0;j<layer.get(i).shape.size();j++)
            if (layer.get(i).shape.get(j) instanceof Circle){
                layer.get(i).shape.remove(j);
                j--;
            }
        }
    }

}