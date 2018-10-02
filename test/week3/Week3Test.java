import org.junit.Test;
import static org.junit.Assert.assertEquals;
import week3.Week3;

public class Week3Test {

    @Test
    public void Week3Test() {

    // TODO: Viết 5 testcase cho phương thức max()
        Week3 test = new Week3();
        int m = 1;
        int n = 4;
        int p = 4;
        int max = test.max(m,n);
        assertEquals(p, max);

        int m1 = 4;
        int n1 = 3;
        int p1 = 4;
        int max1 = test.max(m1,n1);
        assertEquals(p1, max1);

        int m2 = 5;
        int n2 = 0;
        int p2 = 5;
        int max2 = test.max(m2,n2);
        assertEquals(p2, max2);

        int m3 = -1;
        int n3 = -4;
        int p3 = -1;
        int max3 = test.max(m3,n3);
        assertEquals(p3, max3);

        int m4 = 41;
        int n4 = 54;
        int p4 = 54;
        int max4 = test.max(m4,n4);
        assertEquals(p4, max4);

    // TODO: Viết 5 testcase cho phương thức minOfArray()
         int[] array = new int[4];
        array[0] = 1;
        array[1] = 4;
        array[2] = 0;
        array[3] = -22;
        int min1 = -22;
        int min2 = test.minOfArray(array);
        assertEquals(min1, min2);

        int[] array1 = new int[4];
        array1[0] = 3;
        array1[1] = 5;
        array1[2] = 4;
        array1[3] = 3;
        int min3 = 3;
        int min4 = test.minOfArray(array1);
        assertEquals(min3, min4);

        int[] array2 = new int[5];
        array2[0] = 1;
        array2[1] = 4;
        array2[2] = 0;
        array2[3] = -22;
        array2[4] = -78;
        int min5 = -78;
        int min6 = test.minOfArray(array2);
        assertEquals(min5, min6);

        int[] array3 = new int[3];
        array3[0] = 1;
        array3[1] = 4;
        array3[2] = 0;
        int min7 = 0;
        int min8 = test.minOfArray(array3);
        assertEquals(min7, min8);

        int[] array4 = new int[3];
        array4[0] = 8;
        array4[1] = 6;
        array4[2] = 7;
        int min9 = 6;
        int min10 = test.minOfArray(array4);
        assertEquals(min9, min10);

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
          double weight = 60;
        double height = 1.7;
        String b = test.calculateBMI(weight, height);
        String b1 = "Binh thuong";
        assertEquals(b,b1);

        double weight1 = 50;
        double height1 = 1.63;
        String b2 = test.calculateBMI(weight1, height1);
        String b3 = "Binh thuong";
        assertEquals(b2,b3);

        double weight2 = 40;
        double height2 = 1.63;
        String b4 = test.calculateBMI(weight2, height2);
        String b5 = "Thieu can";
        assertEquals(b4,b5);

        double weight3 = 60;
        double height3 = 1.6;
        String b6 = test.calculateBMI(weight3, height3);
        String b7 = "Thua can";
        assertEquals(b6,b7);

        double weight4 = 66;
        double height4 = 1.8;
        String b8 = test.calculateBMI(weight4, height4);
        String b9 = "Binh thuong";
        assertEquals(b8,b9);
    }
}
