package c7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executor  = null;
        try {
            executor = Executors.newSingleThreadExecutor();
            executor.execute(() -> {
                for (int i = 0; i<10; i++) {
                    System.out.println(i);
                }
            });
            System.out.println("---------------");
        } finally {
            if (executor != null) executor.shutdown();
        }
        System.out.println("Bye");
    }
}
