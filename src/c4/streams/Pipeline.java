package c4.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Pipeline {
    public static void main(String[] args) {
        Stream.generate(() -> "1").limit(10).peek(System.out::println);

        List<String> cats = new ArrayList<>();
        cats.add("Annie");
        cats.add("Ripley");
        Stream<String> stream = cats.stream();
        cats.add("KC");
        System.out.println(stream.count());
        System.out.println(stream.findFirst());
    }
}
