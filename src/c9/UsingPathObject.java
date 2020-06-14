package c9;

import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPathObject {
    public static void main(String[] args) {
        Path path = Paths.get("/land/hippo/harry.happy");
        System.out.println("The Path Name is: "+path);
        for(int i=0; i<path.getNameCount(); i++) {
            System.out.println(" Element "+i+" is: "+path.getName(i));
        }
        System.out.println("Filename is: "+path.getFileName());
        System.out.println("Parent is: "+path.getParent());
        System.out.println("Root is: "+path.getRoot());

        System.out.println(path.getName(10));
    }
}
