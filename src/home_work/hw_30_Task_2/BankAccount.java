package home_work.hw_30_Task_2;

public class BankAccount implements PaymentSystem {

    private double balance;
    private String currency;

    public BankAccount(double initialBalance, String currency) {
        this.balance = initialBalance;
        this.currency = currency;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds in the account");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount + " " + currency + " from the account");
    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
        System.out.println("The account " + amount + " " + currency + ".");
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
