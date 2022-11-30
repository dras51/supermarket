package product;

import java.util.ArrayList;
import java.util.Scanner;

public class SuperMarket {
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

    ArrayList<Product> products = new ArrayList<>();
    float totalEarned = 0f;

    public void addProduct() {
        System.out.println("Adding a product!");

        //Receive product details from user and create product
        System.out.println("Please enter the name of the product: ");
        String name = scanner.nextLine();

        System.out.println("Please enter the quantity of the product: ");
        int quantity = intScanner.nextInt();

        System.out.println("Please enter the description of the product: ");
        String description = scanner.nextLine();

        System.out.println("Please enter the price: ");
        float price = intScanner.nextFloat();

        Product product = new Product(name, quantity, description, price);
        products.add(product);

        System.out.println(name + " added to the supermarket");
    }

    public void listProducts() {
        System.out.println("Listing all products!!!");
        for(Product product: products) {
            System.out.println(product);
        }
    }

    public void demoProducts() {
        Product milk = new Product("Milk", 20, "This is milk", 1.99f);
        Product coffee = new Product("Coffee", 25, "This is coffee", 4.35f);
        Product tea = new Product("Tea", 10, "This is tea", 2.99f);

        products.add(milk);
        products.add(coffee);
        products.add(tea);

        System.out.println("Demo products added successfully");
    }

    public void removeProduct() {
        System.out.println("Please enter the name of product to remove: ");
        String name = scanner.nextLine();

        for(Product product: products) {
            //.equalsIgnoreCase -> compares string ignoring case sensitivity.

            if (name.equalsIgnoreCase(product.name)) {
                products.remove(product);
                System.out.println("Product removed successfully");
                return;
            }
        }

        System.out.println("Product not found!");
    }

    public void buyProduct() {
        System.out.println("Please enter the name of the product to buy: ");
        String name = scanner.nextLine();

        for (Product product: products) {
            if(name.equalsIgnoreCase(product.name)) {
                System.out.println("Please enter the quantity of " + product.name + " you would like to buy:");
                int quantity = intScanner.nextInt();

                //Check if quantity is more than available quantity
                if (quantity > product.quantity) {
                    System.out.println("Quantity greater than what is available!!");
                    return;
                }

                //Subtract quantity to be bought from current product quantity
                //product.quantity = product.quantity - quantity;
                product.quantity -= quantity;

                totalEarned += product.price * quantity;
                System.out.println(quantity + " " + product.name + " bought from the supermarket");
                return;

            }
        }
    }

    public void viewProduct() {
        System.out.println("Please enter the name of product you want to view: ");
        String name = scanner.nextLine();

        for (Product product: products){
            if (name.equalsIgnoreCase(product.name)) {
                System.out.println(product);
            }
        }

        System.out.println("Product not found!");
    }

    public void getTotalEarned() {
        System.out.println("Total amount earned by the super market is: " + totalEarned);
    }

}
