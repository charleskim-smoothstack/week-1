package com.charleskim.dayfour.deadlock;

public class Deadlock {
    public static void main(String[] args) {
        final BankAccount bobAccount = new BankAccount("Bob", 1d);
        final BankAccount johnAccount = new BankAccount("John", 1d);
        new Thread(new Runnable() {
            public void run() { bobAccount.send(johnAccount); }
        }).start();
        new Thread(new Runnable() {
            public void run() { johnAccount.send(bobAccount); }
        }).start();
    }
}
