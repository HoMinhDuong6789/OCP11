package c7;

import java.util.concurrent.*;

public class TestAwaitTermination {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            service.execute(() -> {
                for (int i = 0; i<100; i++) {
                    System.out.println(i);
                }
            });
        } finally {
            if(service != null) service.shutdown();
        }
        if(service != null) {
            service.awaitTermination(1, TimeUnit.NANOSECONDS);
            // Check whether all tasks are finished
            if(service.isTerminated())
                System.out.println("All tasks finished");
            else
                System.out.println("At least one task is still running");
        }
    }
}
