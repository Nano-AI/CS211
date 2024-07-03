/**
 * Shopping cart class to store available items and shopping list
 * @author Aditya Bankoti
 * @date July 2, 2024
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Shopping {
    private ArrayList<Item> AvailableItems; // Available items in the store
    private ArrayList<Item> ShoppingList; // Shopping list

    public Shopping() {
        AvailableItems = new ArrayList<>();
        ShoppingList = new ArrayList<>();
    }

    /**
     * Adds several items into the shopping list
     * @param index Index of item based off of index + 1 of AvailableItems
     * @return Number of items added
     */
    public int addToShoppingList(int... index) {
        int created = 0;
        for (int i : index) {
            if (i > AvailableItems.size()) continue;
            ShoppingList.add(AvailableItems.get(i - 1));
            created++;
        }
        return created;
    }

    /**
     * @return Shopping list
     */
    public ArrayList<Item> getShoppingList() {
        return ShoppingList;
    }

    /**
     * @param item Items to add to available items
     * @return Number of new items added
     */
    public int addToAvailableItems(Item... item) {
        Collections.addAll(AvailableItems, item);
        return item.length;
    }

    /**
     * @return Available items
     */
    public ArrayList<Item> getAvailableItems() {
        return AvailableItems;
    }

    /**
     * @param array Array to remove indexes from
     * @param index Indexes to be removed
     * @return Number of items removed from array
     */
    private int removeIndexes(ArrayList<Item> array, int... index) {
        // convert indexes to an int array
        int[] values = Arrays.stream(index).toArray();
        // sort int array
        Arrays.sort(values);

        int removed = 0;
        for (int v : values) {
            // ensure in-bounds
            if (v - 1 - removed > array.size()) continue;
            // remove (index - 1) - removed, then increment removed by 1
            array.remove(v - 1 - removed++);
        }
        // return number of indexes successfully removed
        return removed;
    }

    /**
     * @param index Indexes to remove
     * @return Number of indexes successfully removed
     */
    public int removeFromShoppingList(int... index) {
        return removeIndexes(ShoppingList, index);
    }

    /**
     * @param index Indexes to remove
     * @return Number of indexes successfully removed
     */
    public int removeFromAvailableItems(int... index) {
        return removeIndexes(AvailableItems, index);
    }

    /**
     * Prints shopping list
     */
    public void printShoppingList() {
        if (ShoppingList.isEmpty()) {
            System.out.println("Shopping list is empty.");
            return;
        }
        ShoppingList.forEach(System.out::println);
    }

    /**
     * Prints available items
     */
    public void printAvailableItems() {
        if (AvailableItems.isEmpty()) {
            System.out.println("No available items.");
            return;
        }

        int index = 1;
        for (Item item : AvailableItems) {
            System.out.printf("%d) %s\n", index, item.toString());
            index++;
        }
    }
}
