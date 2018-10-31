package week7.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileNotFound {
    public static void WriteFile(String filename, String s) throws FileNotFoundException {
        File file = new File(filename);
        PrintWriter out = new PrintWriter(file);

        out.print(s);
        out.close();
    }
    public static void main(String[] args) {
        try {
            FileNotFound.WriteFile("Hello.txt", "hello");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("file khong tim thay de in");
        }
    }
}
