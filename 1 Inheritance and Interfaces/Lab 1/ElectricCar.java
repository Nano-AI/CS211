/**
 * Electric car class which extends the Car class
 * @author Aditya Bankoti
 * @date July 1, 2024
 */

import java.time.Duration;

public class ElectricCar extends Car {
    private Duration chargeTime; // time it takes to charge
    private int batteryCapacity; // capacity of the batter in kWh

    /**
     * Constructor
     * @param name Name of car
     * @param price Price of car
     * @param hp HP of car
     * @param empg EMPG of car
     * @param year Year of car
     */
    public ElectricCar(String name, int price, int hp, double empg, int year) {
        super(name, price, hp, empg, year);
    }

    /**
     * Constructor
     * @param name Name of car
     * @param price Price of car
     * @param hp HP of car
     * @param empg eMPG of car
     * @param year Year of car
     * @param batteryCapacity Battery capacity of car
     * @param chargeTime Charge time to full of car
     */
    public ElectricCar(String name, int price, int hp, double empg, int year, int batteryCapacity, String chargeTime) {
        this(name, price, hp, empg, year);
        this.batteryCapacity = batteryCapacity;
        String[] times = chargeTime.split(":");
        this.chargeTime = Duration.ofHours(Integer.parseInt(times[0]));
        this.chargeTime = this.chargeTime.plusMinutes(Integer.parseInt(times[1]));
        this.chargeTime = this.chargeTime.plusSeconds(Integer.parseInt(times[2]));
    }

    /**
     * Accessor function for charge time
     * @return Charge time
     */
    public Duration getChargeTime() {
        return chargeTime;
    }

    /**
     * Mutator function for charge time
     * @param chargeTime New charge time
     */
    public void setChargeTime(Duration chargeTime) {
        this.chargeTime = chargeTime;
    }

    /**
     * Accessor for battery capacity
     * @return Battery capacity
     */
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * Mutator for battery capacity
     * @param batteryCapacity New battery capacity
     */
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    /**
     * Format electric car infromation to a string to return
     * @return String formatted version of electric car
     */
    @Override
    public String toString() {
        return super.toString() +
                String.format("\nCharge Time: %s\nBattery Capacity: %d kWh", getChargeTime().toString(), getBatteryCapacity());
    }
}
