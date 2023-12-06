package org.example.multitrading;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("start MyThread");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);

            }
            System.out.println("end MyThread");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
