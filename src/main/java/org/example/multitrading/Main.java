package org.example.multitrading;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new MyThread();
        Thread thread2 = new MyThread();
        Thread thread1 =new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread());
                    MyClass.extracted();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
        thread2.start();
        thread1.start();
//        thread.join(7000);
//        for (int i = 5; i >= 0; i--) {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        Thread.sleep(2000);
//        System.out.println("start");
    }
}
