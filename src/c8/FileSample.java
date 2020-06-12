package c8;

import java.io.File;

public class FileSample {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Thuy\\Desktop\\test.txt");
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.lastModified());
        System.out.println(file.delete());
        System.out.println(file.listFiles());
    }
}
