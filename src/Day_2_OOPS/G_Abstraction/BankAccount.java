package Day_2_OOPS.G_Abstraction;

abstract public class BankAccount {
//    Properties
    private String accountNumber;
    private double balance;

//    Methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

//    Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

//    Getter
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
