/**
 * Package bài làm cho Câu 1
 * TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu. 1 file chỉ khai báo 1 class
 * TODO: Mô tả các quan hệ giữa các class và thêm thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc tính)
 * TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 * @author cuong
 * @version 0.1
 */
package week4.task1;
public class main {
    public static void main(String[] args) {

        Cam c1 = new Cam("Cam", 2000, 15000, "Ha Noi");
        Cam c2 = new Cam("Cam", 1500, 20000, "Hai Duong");

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        if(c1.CompareNumber(c2)) {
            System.out.println("Hai loai cam tren cung so luong");
        }
        else
            System.out.println("Hai loai cam tren khac so luong");

        if(c1.CompareCost(c2)) {
            System.out.println("Hai loai cam tren cung gia ban");
        }
        else
            System.out.println("Hai loai cam tren khac gia ban");

        Tao t1 = new Tao("Tao", 2000, 15000, "Hung Yen");
        Tao t2 = new Tao("Tao", 1500, 20000, "Hai Phong");

        System.out.println(t1.toString());
        System.out.println(t2.toString());

        if(t1.CompareNumber(t2)) {
            System.out.println("Hai loai tao tren cung so luong");
        }
        else
            System.out.println("Hai loai tao tren khac so luong");

        if(t1.CompareCost(t2)) {
            System.out.println("Hai loai tao tren cung gia ban");
        }
        else
            System.out.println("Hai loai tao tren khac gia ban");
        CamCaoPhong cp1 = new CamCaoPhong("Cam Cao Phong", 2000, 15000, "Hoa Binh", "1/10/2018", 50);
        CamCaoPhong cp2 = new CamCaoPhong("Cam Cao Phong", 1500, 15000, "Hoa Binh", "9/10/2018", 48);

        System.out.println(cp1.toString());
        System.out.println(cp2.toString());

        if(cp1.CompareOrder(cp2)) {
            System.out.println("So don dat hang trong 2 ngay tren nhu nhau");
        }
        else
            System.out.println("So don dat hang trong 2 ngay tren khac nhau");

        CamSanh cs1 = new CamSanh("Cam Sanh", 2000, 15000, "Tuyen Quang", "6/10/2018", 50);
        CamSanh cs2 = new CamSanh("Cam Sanh", 1500, 20000, "Ha Giang", "10/10/2018", 50);

        System.out.println(cs1.toString());
        System.out.println(cs2.toString());

        if (cs1.CompareOrder(cs2)) {
            System.out.println("So don dat hang trong 2 ngay tren nhu nhau");
        } else
            System.out.println("So don dat hang trong 2 ngay tren khac nhau");

    }
}
