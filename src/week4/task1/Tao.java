package week4.task1;
/**
 * class này biểu diễn đối tượng Táo kế thừa từ Hoa Quả
 * @see HoaQua
 */

public class Tao extends HoaQua{

    private int cost;
    private String place;

    public void setCost(int cost) {
        this.cost = cost;
    }
    public int getCost() {
        return cost;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getPlace() {
        return place;
    }


    public Tao(String name, int number, int cost, String place) {
        super(name, number);
        this.cost = cost;
        this.place = place;
    }
    /**
     * phương thức này trả về giá trị biểu diễn chuỗi của đối tượng
     * @return giá bán cho 1 cân và nơi trồng
     */
    public String toString() {
        return super.toString() + "\n" + "Gia/can: "+getCost()+"\n"+"Noi san xuat: "+getPlace();
    }
    /**
     * phương thức này giúp so sánh giá bán 2 loại táo khác nhau
     * @param obj đối tượng
     * @return true hoặc false
     */
    public boolean CompareCost(Object obj) {
        Tao t = (Tao) obj;
        if(t.cost==cost) {
            return true;
        }
        else
            return false;
    }

}