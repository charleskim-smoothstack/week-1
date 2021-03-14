package com.charleskim.dayfour.producerconsumer;

/**
 * Represents a threadsafe mutable bounded buffer.
 */
public class Buffer {
    private static final int BUFFER_SIZE = 7;
    private int[] items = new int[BUFFER_SIZE];
    private int itemsCount = 0;

    /**
     * Adds an item to this buffer. If it's full, waits until notified that it's
     * not full.
     * @param item
     */
    public synchronized void add(int item) {
        while (this.itemsCount == BUFFER_SIZE) {
            try { 
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.items[this.itemsCount] = item;
        this.itemsCount++;
        this.notifyAll();
    }

    /**
     * Removes the last item from this buffer. If it's empty, wait until
     * notified that it's not empty.
     * @return The integer that is the last item in this buffer.
     */
    public synchronized int remove() {
        while (this.itemsCount == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int item = this.items[this.itemsCount - 1];
        this.items[this.itemsCount - 1] = 0;
        this.itemsCount--;
        this.notifyAll();
        return item;
    }

    /**
     * @return The number of items in this buffer.
     */
    public synchronized int getItemsCount() {
        return this.itemsCount;
    }
}
