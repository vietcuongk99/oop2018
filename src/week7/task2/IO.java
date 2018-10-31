package week7.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IO {

    public static void readFile() throws IOException {
        BufferedReader br = null;
        br = new BufferedReader(new FileReader("file.txt"));
        String line = br.readLine();
        StringBuilder sb = new StringBuilder();

        while (line != null) {
            sb.append(line);
            sb.append("\n");
            line = br.readLine();
        }
        String content = sb.toString();
        System.out.println(content);
    }
    public static void main(String[] args) {
        try {
            IO.readFile();
        }
        catch (IOException e) {
            System.out.println("Khong the doc duoc file");
        }
    }

}
