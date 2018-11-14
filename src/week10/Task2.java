package week10;

import java.util.Random;

public class Task2 {
    public static int[] BubbleSort(int a[]) {
        int temp;
        for(int i = 0; i<a.length-1; i++) {
            for(int j = 0; j <a.length - i - 1; j++)
                if(a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                }
        }
        return a;
    }
    public static void main(String[] args) {
        int [] a = new int[1000];
        Random ran = new Random();


        for(int i = 0; i<a.length; i++) {
            int random = ran.nextInt(1000) + 1;
            a[i] = random;

        }

        BubbleSort(a);
        for(int j = 0; j<a.length; j++) {
            System.out.println(a[j]);
        }
    }
}
