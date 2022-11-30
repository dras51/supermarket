import product.SuperMarket;

import java.util.Scanner;

public class Main {
    SuperMarket superMarket = new SuperMarket();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the supermarket!! Select an option below!");
        Scanner scanner = new Scanner(System.in);

        Main main = new Main();


        String input = "";

        do {
            System.out.println("""
                1. Staff
                2. Customer
                """);

            input = scanner.nextLine();

            switch (input) {
                case "1":
                    main.staffMenu();
                    break;
                case "2":
                    main.customerMenu();
                    break;
                case "quit":
                    System.out.println("Exiting application!!!");
                default:
                    System.out.println("Select a valid menu option!");
                    break;
            }
        } while (!input.equals("quit"));


    }

    public void staffMenu() {
        String input = "";

        do {
            System.out.println("""
                    1. Add a product
                    2. View all products
                    3. Remove product
                    4. View Single product
                    5. Total money earned by supermarket
                    6. Add demo products
                              
                    """);

            input = scanner.nextLine();

            switch(input) {
                case "quit":
                    System.out.println("Logging out staff!");
                    break;
                case "1":
                    superMarket.addProduct();
                    break;
                case "2":
                    superMarket.listProducts();
                    break;
                case "3":
                    superMarket.removeProduct();
                    break;
                case "4":
                    superMarket.viewProduct();
                    break;
                case "5":
                    superMarket.getTotalEarned();
                    break;
                case "6":
                    superMarket.demoProducts();
                    break;
                default:
                    System.out.println("Please select a valid input!");
                    break;
            }
        } while (!input.equals("quit"));
    }

    public void customerMenu() {
        String input = "";

        do {
            System.out.println("Customer Menu!");
            System.out.println("""
                    1. View all products
                    2. View single product
                    3. Buy a product
                    
                    enter quit to log out
                    """);

            input = scanner.nextLine();

            switch (input) {
                case "1":
                    superMarket.listProducts();
                    break;
                case "2":
                    superMarket.viewProduct();
                    break;
                case "3":
                    superMarket.buyProduct();
                    break;
                case "quit":
                    System.out.println("Logging out customer!");
                    break;
                default:
                    System.out.println("please select a valid option");
            }
        } while (!input.equals("quit"));
        //view all products
        //view single product
        //buy product
    }

}
