package week11;

import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
//     public static <T extends Comparable> void getMax(ArrayList<T> list) {
//         System.out.println(Collections.max(list));

//     }


//     public static void main(String args[]) {

//         ArrayList<String> al = new ArrayList<>();
//         al.add("Cuong");
//         al.add("Long");
//         al.add("Dong");

//         getMax(al);
//     }
    public static <T extends Comparable> T getMax(T[] a) {
       
        T max = a[0];
        for (int i = 1; i < a.length; i++) {

            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return max;
    }

    public static void main(String args[]) {

        String[] al = {"Cuong","dong","long"};

        System.out.println(getMax(al));

    }
}
