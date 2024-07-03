/**
 * Main class which calls Items, Shopping, and Utils
 * @author Aditya Bankoti
 * @date July 2, 2024
 */

import java.util.Scanner;

public class Menu {
    // Menu options
    private static final String[] MENU_A = new String[]{
            "Shopping List",
            "------------------------------------------",
            "1) Add to Shopping List",
            "2) Remove from Shopping List",
            "3) Print Shopping List\n",
            "Available Items",
            "------------------------------------------",
            "4) Add to Available Items",
            "5) Remove from Available Items",
            "6) Print Available Items\n",
            "7) Exit Program",
    };

    // Convert menu array to string
    private static final String MENU = String.join("\n", MENU_A);

    public static void main(String[] args) {
        boolean done = false;

        Shopping shopping = new Shopping();

        // create sample items
        shopping.addToAvailableItems(new Item("Eggs, Dozen", "Poultry", 5.99f));
        shopping.addToAvailableItems(new Item("Milk, While, Gallon", "Dairy", 6.99f));
        shopping.addToAvailableItems(new Item("Spinach, Baby, 1lb", "Produce", 4.99f));

        // print menu
        System.out.println(MENU);

        // system scanner
        Scanner scanner = new Scanner(System.in);

        // menu-loop
        while (!done) {
            System.out.print("> ");

            // get input from user
            int option;
            try {
                option = scanner.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
                continue;
            }

            // consume the \n char
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Item number(s): ");
                    // convert user input to int array, then use those indexes to add to shopping list
                    System.out.printf(
                            "Added %d items to shopping list\n",
                            shopping.addToShoppingList(Utils.nextInts(scanner))
                    );
                    break;
                case 2:
                    System.out.println("Item numbers: ");
                    // convert user input to int array, then use those indexes to remove from shopping list
                    System.out.printf(
                            "Removed %d items\n",
                            shopping.removeFromShoppingList(Utils.nextInts(scanner))
                    );
                    break;
                case 3:
                    System.out.println("Shopping List: ");
                    shopping.printShoppingList();
                    break;
                case 4:
                    // create new item
                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Department: ");
                    String department = scanner.nextLine();

                    System.out.print("Price: $");
                    float price = scanner.nextFloat();

                    // add item
                    Item newItem = new Item(name, department, price);
                    shopping.addToAvailableItems(newItem);
                    System.out.println("Added " + newItem);

                    break;
                case 5:
                    System.out.println("Item numbers: ");
                    // convert user input to int array, then use those indexes to remove from available items
                    System.out.printf(
                            "Removed %d items\n",
                            shopping.removeFromAvailableItems(Utils.nextInts(scanner))
                    );
                    break;
                case 6:
                    System.out.println("Available Items: ");
                    shopping.printAvailableItems();
                    break;
                case 7:
                    done = true;
                    break;
                default:
                    System.out.println("Please enter a valid option between 1-7!");
                    break;
            }

            // new line for easier readability
            System.out.println();
        }

        // close scanner
        scanner.close();

        // goodbye message
        System.out.println("Thanks for shopping with us, " + System.getProperty("user.name") + "!");
    }
}
