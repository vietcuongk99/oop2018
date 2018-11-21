package week11;

import java.util.ArrayList;
import java.util.Collections;


public class Task1 {


    public static <T extends Comparable> void sort(ArrayList<T> list) {
        Collections.sort(list);
        for(T a: list) {
            System.out.println(a);
        }
    }


    public static void main(String args[]) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Cuong");
        al.add("Long");
        al.add("Dong");

        sort(al);


        }
    }


