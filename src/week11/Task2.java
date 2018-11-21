package week11;

import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
    public static <T extends Comparable> void getMax(ArrayList<T> list) {
        System.out.println(Collections.max(list));

    }


    public static void main(String args[]) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Cuong");
        al.add("Long");
        al.add("Dong");

        getMax(al);



    }
}
