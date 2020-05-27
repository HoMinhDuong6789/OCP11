package c3.generic;

import java.util.ArrayList;
import java.util.List;

public class Unbounded {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        //boolean[] b = a;

        Integer[] numbers = {1,2,3};
        Object[] objects = numbers;
        objects[0] = "Ahihi";

        List<String> strings = new ArrayList<String>();
        strings.add("tweet");
        List<Object> objs = new ArrayList<Object>(strings);
    }
}
