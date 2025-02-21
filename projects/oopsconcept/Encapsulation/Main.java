class BankAccount {
    // private data variables (public , proctected, private)
    // access modifiers
    private int secretkey = 239478;
    private String accountHolder;
    private double balance;

    public int getSecret() {
        return secretkey;
    }

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getName(String name) {
        return accountHolder;
    }

    public void setName(String newName) {
        accountHolder = newName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    void displayAccountInfo() {
        System.out.println("Account Holder Name: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount person1 = new BankAccount("Narendra", 50_000);

        person1.displayAccountInfo();

        person1.setName("Narendra Samtani");
        person1.setBalance(1_00_000);

        person1.displayAccountInfo();

        System.out.println("secretkey is: " + person1.getSecret());
    }
}
