package week7.task2;

public class NullPointer {

    private String name;


    public NullPointer(String name) throws NullPointerException {
        if (name == null) throw new NullPointerException();
        this.name = name;
    }

    public static void main(String [] args) {
        try {
            NullPointer t = new NullPointer(null);

            int length = t.name.length();
            System.out.println(length);

        }
        catch (NullPointerException e) {
            System.out.println("Loi NullPointException");
        }
    }
}
