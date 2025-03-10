package home_work.hw_30_Task_2;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(1000.00, "Euro");
        ElectronicWallet wallet = new ElectronicWallet(500.0, "USD");

        bankAccount.depositTransfer(500.0);
        bankAccount.withdrawMoney(200.0);

        System.out.println("Bank account balance: " + bankAccount.checkBalance() + " Euro");

        wallet.depositTransfer(100.0);
        wallet.withdrawMoney(300.0);

        System.out.println("E-wallet balance: " + wallet.checkBalance() + " USD");
    }
}
