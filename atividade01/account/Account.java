package atividade01.account;

public class Account {
    // ATTRIBUTES
    private String id;
    private String name;
    private int balance;

    // CONSTRUCTOR WITHOUT BALANCE
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    // CONSTRUCTOR WITH BALANCE
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // METHODS
    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    public int transferTo(Account anotherAccount, int amount) {
        if (amount <= this.balance) {
            this.debit(amount);
            anotherAccount.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    // GETTERS
    public int getBalance() { return this.balance; }

    public String getID() { return this.id; }

    public String getName() { return this.name; }


    // TO STRING
    @Override
    public String toString() {
        return "Account[id=" + this.getID() + ", name=" + this.getName() + ", balance=" + this.getBalance() + "]";
    }
}
