package com.company;


//? Write an application that executes two threads. One thread displays "Thread1" every 1000 milliseconds & another thread displays "Thread2" every 3000 milliseconds. Create the threads by implementing the Runnable interface

import java.util.Objects;

class ThreadExample extends Thread {
    ThreadExample(String s) {
        super(s);
        start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                if (Objects.equals(Thread.currentThread().getName(), "Thread1")) {
                    Thread.sleep(1000);
                } else {
                    Thread.sleep(3000);
                }
            } catch (Exception ignored) {
            }
        }
    }
}

class TwoThread {
    public static void main(String[] arg) {
        System.out.println("Thread name : " + Thread.currentThread().getName());
        new ThreadExample("Thread1");
        new ThreadExample("Thread2");
    }
}