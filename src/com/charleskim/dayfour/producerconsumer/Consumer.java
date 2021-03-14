package com.charleskim.dayfour.producerconsumer;

public class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override public void run() {
        while (true) {
            int removedItem = this.buffer.remove();
            System.out.format("Item taken: %s. Items count: %s.%n", removedItem,
                this.buffer.getItemsCount());
        }
    }
}
