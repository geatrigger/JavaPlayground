package com.company.counter;

public class Counter {
    private int i = 0;

    public synchronized int increment() {
        return i = i + 1;
    }
}
