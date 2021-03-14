package com.charleskim.dayfour.producerconsumer;

public class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override public void run() {
        while (true) {
            int itemToAdd = 1;
            this.buffer.add(itemToAdd);
            System.out.format("Item added: %s. Items count: %s.%n", itemToAdd,
                this.buffer.getItemsCount());
        }
    }
}
