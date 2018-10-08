package week4.task2;

/**
 *  class này dùng để biểu diễn các hình phẳng
 */

public class Shape {

        private String color;
        private boolean filled;

        public Shape() {

        }

        public Shape(String color, boolean filled) {
            this.color = color;
            this.filled = filled;

        }
        public void setColor(String color) {
            this.color = color;
        }
        public String getColor(){
            return color;
        }
        public void setFilled(boolean filled) {
            this.filled = filled;
        }
        public boolean isFilled() {
            return filled;
        }

        @Override
        public String toString() {
            return "Shape{" +
                "color = " + color +
                ", filled = " + filled +
                '}';
    }
}
