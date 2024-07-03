/**
 * Stores the Car template.
 * @author Aditya Bankoti
 * @date July 1, 2024
 */

import java.util.UUID;

public class Car {
    private String id; // id of car
    private String name; // name of car
    private int hp; // horsepower from ENGINE (not wheel)
    private double mpg; // combined miles per gallon
    private int year; // year it was made
    private int price; // price in dollars

    /**
     * Constructor for base car
     * @param name Name of the car
     * @param price Price of the car in dollars
     * @param hp Horsepower produced by the engine
     * @param mpg Combined miles per gallon
     * @param year Year car was made
     */
    public Car(String name, int price, int hp, double mpg, int year) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.hp = hp;
        this.mpg = mpg;
        this.year = year;
        this.price = price;
    }

    /**
     * Accessor function for ID
     * @return Car's ID
     */
    public String getId() {
        return this.id;
    }

    /**
     * Accessor function for car's name
     * @return Car's name
     */
    public String getName() {
        return name;
    }

    /**
     * Mutator function for car's name
     * @param name Car's new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Accessor function for car's HP
     * @return Car's HP
     */
    public int getHp() {
        return hp;
    }

    /**
     * Mutator function for car's HP
     * @param hp Car's new HP
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * Accessor for car's MPG
     * @return Car's MPG
     */
    public double getMpg() {
        return mpg;
    }

    /**
     * Mutator for car's MPG
     * @param mpg Car's new MPG
     */
    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    /**
     * Accessor for car's make year
     * @return Car's make year
     */
    public int getYear() {
        return year;
    }

    /**
     * Mutator for car's year
     * @param year Car's new year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Accessor for car's price
     * @return Car's price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Mutator for car's price
     * @param price Car's new price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Check for two cars being equal
     * @param c Car to compare with
     * @return True if cars are same, false otherwise
     */
    @Override
    public boolean equals(Object c) {
        if (!(c instanceof Car car)) return false;
        return this.id.equals(car.getId());
    }

    /**
     * toString override
     * @return Formatted string containing car's information
     */
    @Override
    public String toString() {
        return String.format(
                "%d \"%s\" for %s\nHP: %d\nMPG: %.2f", getYear(), getName(), Utils.moneyToString(getPrice()), getHp(), getMpg()
        );
    }
}
