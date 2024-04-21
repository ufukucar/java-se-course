package com.ufukucar._02_implementasyon;



class MyBaseThread implements Runnable {


    @Override
    public void run() {
        System.out.println("MyBaseThread is running" + Thread.currentThread().getName());
    }

}


public class AppMain {
    public static void main(String[] args) {

        MyBaseThread myBaseThread = new MyBaseThread();

        System.out.println("Main thread started");

        Thread thread = new Thread(myBaseThread);
        thread.start();













    }
}