package c3.collection;

import java.util.*;

public class TestListAndArrayList {
    public static void main(String[] args) {
        String[] array = { "gerbil", "mouse"};
        List<String> list = Arrays.asList(array);
        System.out.println("list: " + list);
        list.set(1, "test");
        System.out.println("list: " + list);
        array[0] = "new";
        System.out.print("array: ");
        for (String item : array) {
            System.out.print(item+ " ");
        }
        System.out.println();
        System.out.println("list: " + list);
        String[] array2 = list.toArray(new String[5]);
        array[1] = "new1";
        System.out.println("list: " + list);
        System.out.print("array: ");
        for (String item : array) {
            System.out.print(item+ " ");
        }
        System.out.println();
        System.out.print("array2: ");
        for (String item : array2) {
            System.out.print(item+ " ");
        }System.out.println();
        list.remove(1);
    }
}
