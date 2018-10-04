ipackage week3;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Week3Test {

    @Test
    public void Week3Test() {

    // TODO: Viết 5 testcase cho phương thức max()
        week3.Week3 test = new week3.Week3();

        int max = test.max(1,4);
        assertEquals(4, max);

        int max1 = test.max(4,3);
        assertEquals(4, max1);

        int max2 = test.max(5,0);
        assertEquals(5, max2);

        int max3 = test.max(-1,-4);
        assertEquals(-1, max3);

        int max4 = test.max(41,54);
        assertEquals(54, max4);

    // TODO: Viết 5 testcase cho phương thức minOfArray()
        int[] array = {1,4,0,-22};
        assertEquals(-22, test.minOfArray(array));

        int[] array1 = {3,5,4,3};
        assertEquals(3, test.minOfArray(array1));

        int[] array2 = {1,4,0,-22,-78};
        assertEquals(-78, test.minOfArray(array2));

        int[] array3 = {1,4,0};
        assertEquals(0, test.minOfArray(array3));

        int[] array4 = {8,6,7};
        assertEquals(6, test.minOfArray(array4));

    // TODO: Viết 5 testcase cho phương thức calculateBMI()

        String b = test.calculateBMI(60, 1.7);
        String b1 = "Binh thuong";
        assertEquals(b,b1);

        String b2 = test.calculateBMI(50, 1.63);
        String b3 = "Binh thuong";
        assertEquals(b2,b3);

        String b4 = test.calculateBMI(40, 1.63);
        String b5 = "Thieu can";
        assertEquals(b4,b5);

        String b6 = test.calculateBMI(60, 1.6);
        String b7 = "Thua can";
        assertEquals(b6,b7);

        String b8 = test.calculateBMI(66, 1.8);
        String b9 = "Binh thuong";
        assertEquals(b8,b9);
    }
}
