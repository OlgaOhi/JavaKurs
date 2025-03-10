package home_work.hw_30_Task_2;

public class ElectronicWallet implements PaymentSystem {

    private double balance;
    private String currency;

    public ElectronicWallet(double initialBalance, String currency) {
        this.balance = initialBalance;
        this.currency = currency;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds in your wallet");
            return;
        }
        balance -= amount;
        System.out.println("The wallet's been withdraw " + amount + " " + currency + ".");
    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
        System.out.println("Wallet's been creditet " + amount + " " + currency + ".");

    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
