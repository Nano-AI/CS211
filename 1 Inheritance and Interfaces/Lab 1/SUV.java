/**
 * SUV class with class-variables specific to SUVs
 * @author Aditya Bankoti
 * @date July 1, 2024
 */

public class SUV extends Car {
    private boolean offRoadable; // Whether the SUV is off-roadable
    private int cargoCapacity; // Cargo capacity of the SUV in cubic feet
    private int towingCapacity; // Towing capacity of the SUV in pounds

    /**
     * Constructor for SUV with basic details
     * @param name Name of the SUV
     * @param price Price of the SUV
     * @param hp Horsepower produced by the engine
     * @param mpg Miles per gallon of the SUV
     * @param year Year of the SUV
     */
    public SUV(String name, int price, int hp, double mpg, int year) {
        super(name, price, hp, mpg, year);
    }

    /**
     * Constructor for SUV with full details
     * @param name Name of the SUV
     * @param price Price of the SUV in dollars
     * @param hp Horsepower produced by the engine
     * @param mpg Miles per gallon of the SUV
     * @param year Year of the SUV
     * @param offRoadable Whether the SUV is off-road capable
     * @param cargoCapacity Cargo capacity of the SUV in cubic feet
     * @param towingCapacity Towing capacity of the SUV in pounds
     */
    public SUV(String name, int price, int hp, double mpg, int year, boolean offRoadable, int cargoCapacity, int towingCapacity) {
        super(name, price, hp, mpg, year);
        this.offRoadable = offRoadable;
        this.cargoCapacity = cargoCapacity;
        this.towingCapacity = towingCapacity;
    }

    /**
     * Accessor for the SUV's towing capacity.
     * @return Towing capacity of the SUV in pounds
     */
    public int getTowingCapacity() {
        return towingCapacity;
    }

    /**
     * Mutator for the SUV's towing capacity.
     * @param towingCapacity New towing capacity of the SUV in pounds
     */
    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    /**
     * Accessor for the SUV's cargo capacity.
     * @return Cargo capacity of the SUV in cubic feet
     */
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    /**
     * Mutator for the SUV's cargo capacity.
     * @param cargoCapacity New cargo capacity of the SUV in cubic feet
     */
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    /**
     * Accessor for whether the SUV is off-road capable.
     * @return True if the SUV is off-road capable, false otherwise
     */
    public boolean isOffRoadable() {
        return offRoadable;
    }

    /**
     * Mutator for whether the SUV is off-road capable.
     * @param offRoadable True to set the SUV as off-road capable, false otherwise
     */
    public void setOffRoadable(boolean offRoadable) {
        this.offRoadable = offRoadable;
    }

    /**
     * ToString method for the SUV.
     * @return Formatted string of the SUV with relevant fields
     */
    @Override
    public String toString() {
        return super.toString() +
                String.format("\nOff Road Capable: %s\nCargo Capacity: %d cubic feet\nTowing Capacity: %d pounds",
                        isOffRoadable() ? "Yes" : "No",  getCargoCapacity(), getTowingCapacity());
    }
}
