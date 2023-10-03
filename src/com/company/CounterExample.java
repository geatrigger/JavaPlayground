package com.company;

public class CounterExample implements Runnable {
    private final Counter counter;

    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable counterExample1 = new CounterExample(counter);
        Runnable counterExample2 = new CounterExample(counter);
        Thread thread1 = new Thread(counterExample1);
        Thread thread2 = new Thread(counterExample2);

        thread1.start();
        thread2.start();

    }

    public CounterExample(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " Value: " + counter.increment());
        }
    }
}
