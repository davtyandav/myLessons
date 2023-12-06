package org.example.multitrading;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread =new MyThread();
        thread.start();
        thread.join(7000);
        for (int i = 5; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        Thread.sleep(2000);
        System.out.println("start");
    }
}
