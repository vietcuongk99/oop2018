package week11;

import java.util.ArrayList;
import java.util.Collections;


public class Task1 {


//     public static <T extends Comparable> void sort(ArrayList<T> list) {
//         Collections.sort(list);
//         for(T a: list) {
//             System.out.println(a);
//         }
//     }
    public static <T extends Comparable> void sort(T[] a) {

            for(int i = 0 ; i < a.length - 1 ; i++){
                for (int j = 0 ; j < a.length - 1  ; j++){
                    if(a[j].compareTo(a[j+1])>0){
                        T temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }

                }
            }
    }

    public static void main(String args[]) {

        Integer[] al = {10,5,6,6,1};

        sort(al);
        for(int i = 0; i<al.length; i++) {
            System.out.println(al[i]);
        }

    }
}



