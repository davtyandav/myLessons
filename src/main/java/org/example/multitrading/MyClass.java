package org.example.multitrading;

public class MyClass {
    public static synchronized void extracted() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("end MyThread");
    }
}
