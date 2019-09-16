package sept_16;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store theStore = new Store("Kay's Jewelers", "Joe");

        System.out.println("Welcome to " + theStore.getName() + " by " + theStore.getOwner_name());

        int option  = 0;

        while(option != -1) {
            System.out.println("What would you like to do?");
            System.out.println("1 \t Rename store");
            System.out.println("2 \t Change owner");
            System.out.println("3 \t List Products");
            System.out.println("4 \t Sell product");
            System.out.println("5 \t add product");
            System.out.println("6 \t Restock");
            System.out.println("7 \t Inventory left");
            System.out.println("-1 \t exit");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("What would you like to name the store");
                    String newStoreName = scanner.nextLine();
                    theStore.setName(newStoreName);
                    break;
                case 2:
                    System.out.println("Who is the new owner?");
                    String newOwner = scanner.nextLine();
                    theStore.setOwner_name(newOwner);
                    break;
                case 3:
                    theStore.listProducts();
                    break;
                case 4:
                    System.out.println("Whats the id of the product being sold");
                    int id = scanner.nextInt();
                    theStore.sell(id);
                    break;
                case 5:
                    System.out.println("Whats the name of the necklace?");
                    String productName = scanner.nextLine();
                    System.out.println("How much is it worth?");
                    double price = scanner.nextDouble();
                    theStore.addProduct(new Necklace(productName, price));
                case 6:
                    System.out.println("Restocking products");
                    theStore.restock();
                    break;
                case 7:
                    System.out.println("There are still " + theStore.getNumOfProductsLeft() + " products left");
                    break;

            }
        }

        System.out.println("Thanks for visiting " + theStore.getName() + " Please come again!");

    }
}
