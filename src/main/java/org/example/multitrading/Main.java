package org.example.multitrading;

public class Main {
    public static void main(String[] args) {

        Thread thread = new MyThread();
        Thread thread2 = new MyThread();
        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread());
            try {
                MyClass.extracted();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
        thread.start();
        thread2.start();
        thread1.start();

    }
}
