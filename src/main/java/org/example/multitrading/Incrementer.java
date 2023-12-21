package org.example.multitrading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Incrementer {
    private int counter = 0;
    private Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        counter++;
        lock.unlock();
    }

    public int getCounter() {
        return counter;
    }
}
