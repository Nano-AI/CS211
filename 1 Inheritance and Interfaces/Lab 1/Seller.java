/**
 * Template for seller
 * @author Aditya Bankoti
 * @date July 1, 2024
 */

import java.util.ArrayList;

public interface Seller {
    String getName();
    void setName(String name);
    ArrayList<Car> getInventory();
    void addCar(Car c);

    boolean orderCar(Car c);

    /**
     * Add cars
     * @param cars Selection of cars to add to seller
     */
    default void addCars(Car... cars) {
        for (Car c : cars) {
            this.addCar(c);
        }
    }

    String toString();
}
