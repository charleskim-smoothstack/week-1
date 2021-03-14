package com.charleskim.dayfour.singleton;

public class Singleton {
    private static volatile Singleton instance;

    /**
     * Returns a singleton. Creates a singleton if the instance variable is
     * null and no other thread is trying to create an instance.
     * @return The singleton held by this class.
     */
    public static Singleton getinstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
