package week9;

import java.io.*;

public class Utils {
    public static String readContentFromFile(String path) throws IOException {


        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = br.readLine();
        StringBuilder sb = new StringBuilder();

        while (line != null) {
            sb.append(line);
            sb.append("\n");
            line = br.readLine();
        }
        String content = sb.toString();

        return content;
    }

    public static void writeContentToFile1(String path) {
        try {
            String data = "Xóa và ghi mới.";
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
            System.out.println("xóa và ghi mới xong");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeContentToFile2(String path) {
        try {
            String data = "Ghi vào cuối file.";
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
            System.out.println("ghi vào cuối file xong");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



public static File findFileByName(String folderPath, String fileName){
    File file = new File(folderPath);
    if (file.exists()) {
        if (file.isFile()) {
            if (file.getName().equals(fileName)) {
                System.out.println(file.getAbsolutePath());
            }
        }
        File[] listFile = file.listFiles();
        if (listFile != null) {
            for (File f : listFile) {
                findFileByName(f.getAbsolutePath(), fileName);
            }
        }
    } else {
        System.out.println("source không tồn tại");
    }
    return file;
}



        public static void main (String[] args){
            Utils a = new Utils();
            try {
                System.out.println(a.readContentFromFile("New folder\\new 1.txt"));
                System.out.println(a.readContentFromFile("New folder\\new 2.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            a.writeContentToFile1("New folder\\new 2.txt");
            a.writeContentToFile2("New folder\\new 2.txt");
            a.findFileByName("New folder","new 2.txt");

        }
    }



