/**
 * Sports car class with additional class-variables more specific to sports cars
 */
public class SportsCar extends Car {
    private double zeroToSixty; // 0-60mph time in seconds
    private int topSpeed; // top speed in mph
    private String engine; // engine used in car
    private String trans; // transmission used in car

    /**
     * Constructor for sports car
     * @param name name of the car
     * @param price price of the car in dollars
     * @param hp hp produced by engine
     * @param mpg miles per gallon of car
     * @param year year of car
     * @param engine engine in car
     * @param zeroToSixty 0-60mph of car in seconds
     * @param topSpeed top speed of car in mph
     * @param trans transmission of the car
     */
    public SportsCar(String name, int price, int hp, double mpg, int year, String engine, double zeroToSixty, int topSpeed, String trans) {
        this(name, price, hp, mpg, year);
        this.engine = engine;
        this.trans = trans;
        this.zeroToSixty = zeroToSixty;
        this.topSpeed = topSpeed;
    }

    /**
     * Constructor for sports car
     * @param name name of the car
     * @param price price of the car
     * @param hp hp produced by engine
     * @param mpg miles per gallon of car
     * @param year year of car
     */
    public SportsCar(String name, int price, int hp, double mpg, int year) {
        super(name, price, hp, mpg, year);
    }

    /**
     * Accessor for the car's engine type.
     * @return Engine type of the car
     */
    public String getEngine() {
        return engine;
    }

    /**
     * Mutator for the car's engine type.
     * @param engine New engine type of the car
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * Accessor for the car's transmission type.
     * @return Transmission type of the car
     */
    public String getTrans() {
        return trans;
    }

    /**
     * Mutator for the car's transmission type.
     * @param trans New transmission type of the car
     */
    public void setTrans(String trans) {
        this.trans = trans;
    }

    /**
     * Accessor for the car's 0-60 mph acceleration time.
     * @return 0-60 mph acceleration time of the car
     */
    public double getZeroToSixty() {
        return zeroToSixty;
    }

    /**
     * Mutator for the car's 0-60 mph acceleration time.
     * @param zeroToSixty New 0-60 mph acceleration time of the car
     */
    public void setZeroToSixty(double zeroToSixty) {
        this.zeroToSixty = zeroToSixty;
    }

    /**
     * Accessor for the car's top speed.
     * @return Top speed of the car
     */
    public int getTopSpeed() {
        return topSpeed;
    }

    /**
     * Mutator for the car's top speed.
     * @param topSpeed New top speed of the car
     */
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    /**
     * To string of car
     * @return formatted version of sports car w/ relevant fields
     */
    @Override
    public String toString() {
        return super.toString() +
                String.format("\n0-60mph: %.1f\nTop Speed: %d mph\nEngine: %s\nTransmission: %s",
                        getZeroToSixty(), getTopSpeed(), getEngine(), getTrans());
    }
}
