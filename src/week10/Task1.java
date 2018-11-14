package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Task1 {

    public static List<String> getAllFunction(File path) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = br.readLine();
        StringBuilder sb = new StringBuilder();
        while (line != null) {
            sb.append(line);
            sb.append("\n");
            line = br.readLine();
        }
        String content = sb.toString();
        List<String> b = new ArrayList<>();

        String[] a = content.split("\\n\\n");
        for(int i = 0; i<a.length; i++) {
            if(a[i].contains("public static"))
                b.add(a[i]);
        }
//
//                    b.add(a[1]);
//                    b.add(a[2]);
//                    b.add(a[3]);
//                    b.add(a[4]);

         return b;

    }

//    public static String findFunctionByName(String name) throws IOException {
//        File file = new File("C:\\Users\\Asus K43\\IdeaProjects\\oop2018-master\\src\\week10\\Utils.java");
//        List<String> a = getAllFunction(file);
//
//        String b = new String();
//        for(String c : a) {
//            if(c.contains(name) == true)
//                b = c;
//            else
//                    b = null;
//        }
//
//
//        return b;
//    }



    public static void main(String[] args) {
        try
        {
            File file = new File("src\\week10\\Utils.java");
            List<String> a = getAllFunction(file);
            for (String b : a) {
                System.out.println(b);
            }
//            String c = findFunctionByName("findFileByName(String");
//            if(c==null) {
//                System.out.println("Khong tim thay file");
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
