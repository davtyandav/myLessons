package org.example.multitrading;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Starter {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(3,
                        7,
                        1, TimeUnit.MICROSECONDS,
                        new LinkedBlockingDeque<>(2));

        for (int i = 0; i < 10; i++) {
            MyCallable task = new MyCallable();
            threadPoolExecutor.submit(task);

        }
        threadPoolExecutor.shutdown();
    }
}

class MyCallable implements Callable<Long> {

    @Override
    public Long call() {
        try {
            System.out.println("Thread  started " + Thread.currentThread().getId());
            Thread.sleep(2000);
            System.out.println("Thread  end " + Thread.currentThread().getId());

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }

        return Thread.currentThread().getId();
    }
}
