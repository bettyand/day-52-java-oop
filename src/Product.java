public class Product {
    private double cost;
    private int quantity;
    private String name;

    public Product(double productCost, int purchaseQuantity, String productName) {
        this.cost = productCost;
        this.quantity = purchaseQuantity;
        this.name = productName;
    }

    public void totalCost() {
        System.out.println("Total cost is $" + cost * quantity);
    }

    public void printProduct() {
        System.out.println(name + " costs $" + cost + " and " + quantity + " units were purchased.");
    }
}
