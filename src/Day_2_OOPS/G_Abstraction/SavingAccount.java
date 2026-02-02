package Day_2_OOPS.G_Abstraction;

public class SavingAccount extends BankAccount{

//    Constructor Override from BankAccount
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    //    Method define
    @Override
    public void deposit(double amount) {
        System.out.println("Deposited");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawn");

    }
}
