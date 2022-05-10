public class App {
    public static void main(String[] args) throws Exception {
        // bank account assignment
        BankAccount betty = new BankAccount("Betty", 500);
        betty.deposit(100);
        betty.accountDetails();

        //bank transfer assignment
        BankAccount larry = new BankAccount("Larry", 5_000);
        BankAccount mary = new BankAccount("Mary", 300);
        larry.withdrawal(100);
        mary.deposit(100);
        larry.accountDetails();
        mary.accountDetails();

        //product assignment
        Product coffee = new Product(3, 23, "Cup of Coffee");
        coffee.printProduct();
        coffee.totalCost();
    }
}
