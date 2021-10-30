package com.mipt.ami.java.sec07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static int count;
    public static Lock countLock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 1; i <= 100; i++) {
            Runnable task = () -> {
                for (int k = 1; k <= 1000; k++) {
                    countLock.lock();
                    try {
//                        this.instrinsic.lock();
                        extracted();
//                        this.instrinsic.unlock();
                    } finally {
                        countLock.unlock(); // Make sure the lock is unlocked
                    }                    
                }
            };
            executor.execute(task);
        }
        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.MINUTES);
        System.out.println("Final value: " + count);
    }

    private static synchronized void extracted() {
        count++; // Critical section
    }
}