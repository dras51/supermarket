package product;

public class Product {
    //Name
    //Quantity
    //Description
    //Price
    public String name;
    public int quantity;
    public String description;
    public float price;

    public Product(String name, int quantity, String description, float price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
