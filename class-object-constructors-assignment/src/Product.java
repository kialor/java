public class Product {
    public double cost;
    public int quantity;
    public String name;
    public Product(double cost, int quantity, String name) {
        this.cost = cost;
        this.quantity = quantity;
        this.name = name;
    }

    public void totalCost(){
        double total = this.cost * this.quantity;
        System.out.println("Total cost is: " +total);
    }

    public void printProduct(){
        System.out.println(this.name+ " costs " +this.cost+ " and " +this.quantity+ " units were purchased");
    }
}
