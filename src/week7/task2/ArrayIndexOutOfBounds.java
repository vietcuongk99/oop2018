package week7.task2;

public class ArrayIndexOutOfBounds {

    public static void List(int a[]) throws ArrayIndexOutOfBoundsException {

        for(int i = 0; i<100; i++) {
            System.out.println(a[i]);
            if(i>a.length) throw new ArrayIndexOutOfBoundsException();
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[6];
        for(int i = 0;i<arr.length;i++) {
            arr[i] = i+1;
        }
        try {
            List(arr);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Loi ArrayIndexOutOfBoundsException");
        }
    }
}
