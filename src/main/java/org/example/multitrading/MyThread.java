package org.example.multitrading;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("start MyThread");
        try {
            System.out.println(Thread.currentThread());

            MyClass.extracted();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
