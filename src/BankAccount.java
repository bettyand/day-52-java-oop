public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String customerName, int accountBalance) {
        this.name = customerName;
        this.balance = accountBalance;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        balance -= withdrawalAmount;
    }

    public void accountDetails() {
        System.out.println(name + "'s account contains $" + balance);
    }
}
