package week7.task2;

class Animal {

    private String name;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }
}
class Cat extends Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void Sound() {
        System.out.println("Meow");
    }
}
public class ClassCast {
    public void casting(Object o) throws ClassCastException{
        Cat a = (Cat) o;
    }

    public static void main(String[] args) {

        ClassCast c = new ClassCast();
        Animal a = new Animal("Max");
        Cat b = new Cat("John");

            try {
                c.casting(a);
            }
            catch (ClassCastException e){
                System.out.println("Khong the ep kieu Animal thanh Cat");
            }

        }
    }

