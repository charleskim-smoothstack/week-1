package com.charleskim.dayfour.deadlock;

public class Deadlock {
    /**
     * BankAccount represents a bank account that sends and receives $1.
     */
    private static class BankAccount {
        // The name of the owner of this bank account.
        private String ownerName = "";
        // The amount of money this bank account holds.
        private Double balance = 0d;

        /**
         * Creates a bank account.
         * @param ownerName The name of the owner of this bank account.
         * @param balance The amount of money this account holds.
         */
        public BankAccount(String ownerName, Double balance) {
            this.ownerName = ownerName;
            this.balance = balance;
        }

        /**
         * @return The name of the owner of this bank account.
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * Sends $1 to a given bank account.
         * @param account The bank account to which this bank account sends $1.
         */
        public synchronized void send(BankAccount account) {
            System.out.format("%s sent $1 to %s.%n", this.ownerName,
                account.getOwnerName());
            this.balance -= 1;
            account.receive(this);
        }

        /**
         * Receives $1 from a given bank account.
         * @param account The bank account from which this bank account receives
         * $1.
         */
        public synchronized void receive(BankAccount account) {
            System.out.format("%s received $1 from %s.%n", this.ownerName,
                account.getOwnerName());
            this.balance += 1;
        }
    }

    public static void main(String[] args) {
        final BankAccount alphonse = new BankAccount("Bob", 1d);
        final BankAccount gaston = new BankAccount("John", 1d);
        new Thread(new Runnable() {
            public void run() { alphonse.send(gaston); }
        }).start();
        new Thread(new Runnable() {
            public void run() { gaston.send(alphonse); }
        }).start();
    }
}
