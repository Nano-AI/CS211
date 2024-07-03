/**
 * Website/call sales directly from manufacturer, meaning there's unlimited inventory of cars.
 * @author Aditya Bankoti
 * @date July 1, 2024
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Website implements Seller {
    private String name; // name of the website
    private Set<Car> inventory; // stored inventory of the website
    private String url; // url of the website

    /**
     * Constructor
     * @param name Name of the website
     * @param url URL of the website
     */
    public Website(String name, String url) {
        this.name = name;
        this.url = url;
        this.inventory = new HashSet<Car>();
    }

    /**
     * Accessor for name of the website
     * @return Name of the website
     */
    public String getName() {
        return this.name;
    }

    /**
     * Mutator for name of webstie
     * @param name New name of website
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Accessor for inventory of website
     * @return Inventory of website
     */
    public ArrayList<Car> getInventory() {
        return new ArrayList<Car>(this.inventory);
    }

    /**
     * Add a car to the website
     * @param c Car to add
     */
    public void addCar(Car c) {
        this.inventory.add(c);
    }

    /**
     * Order car from website
     * @param wantedCar Car wanted to be ordered
     * @return If car was found, it returns true. Otherwise, it returns false.
     */
    public boolean orderCar(Car wantedCar) {
        for (Car car : this.inventory) {
            if (car.equals(wantedCar)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Accessor for the URL
     * @return The URL of the website
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Return formatted string of website
     * @return Formatted string of website
     */
    @Override
    public String toString() {
        return String.format("%s - %d order-able cars", name, inventory.size());
    }
}
