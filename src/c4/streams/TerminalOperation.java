package c4.streams;

import java.util.stream.Stream;

public class TerminalOperation {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.reduce(0, (s, n) -> s + n));

        Stream<String> stream1 = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream1.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(word);

        Stream<Integer> stream2 = Stream.iterate(1, i -> i+1);
        System.out.println(stream2.count());
        System.out.println("Ahihi");
    }
}
