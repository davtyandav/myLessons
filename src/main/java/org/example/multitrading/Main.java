package org.example.multitrading;

public class Main {

    public static void main(String[] args) {
        Incrementer incrementer = new Incrementer();

        Runnable runnable = () -> {
            for (int i = 0; i < 100000; i++) {
                incrementer.increment();
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(incrementer.getCounter());
    }

}
