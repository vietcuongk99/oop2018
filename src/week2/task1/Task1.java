package week2.task1;
import java.util.Scanner;
public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if (b==0)
            return a;

        else
            return gcd(b,a%b);
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if(n==0) return 0;
        if(n==1) return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args){
        int a,b,n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao a: ");
        a = sc.nextInt();
        System.out.print("Nhap vao b: ");
        b = sc.nextInt();
        System.out.print("Nhap vao n: ");
        n = sc.nextInt();
        System.out.println("UCLN cua a va b la: "+gcd(a,b)+"\n");

        System.out.print("Day so fibonacci gom " + n +" so la: ");
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i) + " ");
        }


    }

}
