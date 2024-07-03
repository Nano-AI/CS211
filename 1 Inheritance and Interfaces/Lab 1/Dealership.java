/**
 * Physical dealership with a variety of LIMITED options.
 * @author Aditya Bankoti
 * @date July 1, 2024
 */

import java.util.ArrayList;

public class Dealership implements Seller {
    private String name; // Dealership name
    private ArrayList<Car> inventory; // Inventory of cars

    /**
     * Default constructor
     * @param name Name of dealership
     */
    public Dealership(String name) {
        this.name = name;
        this.inventory = new ArrayList<Car>();
    }

    /**
     * Accessor for dealership's name
     * @return Car's name
     */
    public String getName() { return this.name; }

    /**
     * Mutator for dealership's name
     * @param name Dealership's new name
     */
    public void setName(String name) { this.name = name; }

    /**
     * Accessor for car's inventory
     * @return Car's inventory
     */
    public ArrayList<Car> getInventory() {
        return this.inventory;
    }

    /**
     * Mutator for car's inventory
     * @param c New car to add
     */
    public void addCar(Car c) {
        this.inventory.add(c);
    }

    /**
     * Removes car from the inventory
     * @param wantedCar Car wished to be removed from inventory
     * @return True if removed, false if not found.
     */
    public boolean orderCar(Car wantedCar) {
        // iterate through inventory
        for (int i = 0; i < inventory.size(); i++) {
            // remove and return true if found, return false otherwise
            if (inventory.get(i).equals(wantedCar)) {
                inventory.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * toString override
     * @return Formatted information about the dealership
     */
    @Override
    public String toString() {
        return String.format("%s - %d available cars", name, inventory.size());
    }
}
