package week4.task1;

/**
 * class này biểu diễn đối tượng Hoa Quả
 */
public class HoaQua {

    private String name;
    private int number;

    public HoaQua(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    /**
     * phương thức này giúp so sánh giá bán 2 loại quả khác nhau
     * @return true hoặc false
     */
    public boolean CompareNumber (Object obj) {
        HoaQua hq = (HoaQua) obj;
        if(hq.number==number) {
            return true;
        }
        else
            return false;
    }
    /**
     * phương thức này trả về giá trị biểu diễn chuỗi của đối tượng
     * @return loại quả và số lượng được nhâp
     */
    @Override
    public String toString() {
        return "Loai qua: "+getName()+"\n"+"So luong nhap: "+getNumber();
    }
}