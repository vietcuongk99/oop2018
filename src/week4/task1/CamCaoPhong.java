package week4.task1;
/**
 * class này biểu diễn đối tượng Cam Cao Phong kế thừa từ Cam
 * @see Cam
 */
public class CamCaoPhong extends Cam{

        private String date;
        private int order;


    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }
    public void setOrder(int order) {
        this.order = order;
    }
    public int getOrder() {
        return order;
    }

    public CamCaoPhong(String name, int number, int cost, String place, String date, int order) {
        super(name, number, cost, place);
        this.date = date;
        this.order = order;
    }
    /**
     * phương thức này trả về giá trị biểu diễn chuỗi của đối tượng
     * @return ngày đặt hàng và số đơn hàng
     */
    public String toString() {
        return super.toString() + "\n" + "Ngay dat hang: "+getDate()+"\n"+"So don dat hang: "+getOrder();
    }

    /**
     * phương thức này giúp so sánh só đơn hàng vào 2 ngày khác nhau
     * @param obj đối tượng
     * @return true hoặc false
     */
    public boolean CompareOrder(Object obj) {
        CamCaoPhong cp = (CamCaoPhong) obj;
        if(cp.order==order) {
            return true;
        }
        else
            return false;
    }

}
