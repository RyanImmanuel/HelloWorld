package threads.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        for (int i = 1; i < 10; i++) {
            Runnable coolie = new WorkerThread("- "+i);
            es.execute(coolie);
        }
        es.shutdown();
        while (!es.isTerminated()){}

        System.out.println("All done!");
    }
}
