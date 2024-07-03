/**
 * Selection of default cars with their respective information.
 * Companies used:
 * Mazda, General Motors/Chevrolet, BMW, Nissan, Porsche, Bugatti, Toyota, Audi, and Tesla
 *
 * @author Aditya Bankoti
 * @date July 1, 2024
 */

public class DefaultCars {
    public static final Car mazdaMiata = new Car("Mazda MX-5 Miata", 20000, 116, 24.0, 1990);
    public static final Car mazdaRx7 = new SportsCar("Mazda RX-7", 35000, 255, 18, 1995, "1.3L R2", 5.2, 161, "5-speed manual");
    public static final Car chevyC5 = new SportsCar("Chevrolet C5 Corvette", 30000, 345, 19, 1997, "5.7L V8", 4.7, 175, "6-speed manual");
    public static final Car chevyC6 = new SportsCar("Chevrolet C6 Corvette", 40000, 400, 18, 2005, "6.0L V8", 4.2, 186, "6-speed manual");
    public static final Car bmwM5 = new SportsCar("BMW M5", 80000, 500, 15, 2005, "5.0L V10", 4.1, 155, "7-speed SMG");
    public static final Car nissan350z = new SportsCar("Nissan 350Z", 25000, 306, 20, 2007, "3.5L V6", 5.1, 155, "6-speed manual");
    public static final Car porsche918 = new SportsCar("Porsche 918 Spyder", 850000, 887, 22, 2015, "4.6L V8 Hybrid", 2.6, 211, "7-speed PDK");
    public static final Car bugattiChiron = new SportsCar("Bugatti Chiron", 3000000, 1500, 10, 2017, "8.0L W16 Quad-Turbo", 2.4, 261, "7-speed DSG");
    public static final Car toyotaPrius = new Car("Toyota Prius", 25000, 121, 52, 2017);
    public static final Car rollsRoyceGhost = new Car("Rolls-Royce Ghost", 350000, 563, 14, 2020);
    public static final Car toyotaRav4 = new SUV("Toyota RAV4", 30000, 203, 27, 2021, true, 69, 3500);
    public static final Car audiRs6 = new SUV("Audi RS6 Avant", 120000, 591, 18, 2021, false, 30, 5952);
    public static final Car audiR8 = new SportsCar("Audi R8", 170000, 602, 14, 2021, "5.2L V10", 3.2, 205, "7-speed S tronic");
    public static final Car toyotaSupraMk4 = new SportsCar("Toyota Supra Mk4", 45000, 320, 24, 1993, "3.0L I6", 4.6, 155, "6-speed manual");
    public static final Car teslaModelS = new ElectricCar("Tesla Model S", 90000, 1020, 120, 2021, 100, "01:15:00");
    public static final Car bmw330i = new Car("BMW 330i", 55000, 255, 25, 2022);
    public static final Car bmwM3 = new SportsCar("BMW M3", 90000, 473, 16, 2022, "3.0L I6", 4.1, 180, "6-speed manual");
    public static final Car bmwX5 = new SUV("BMW X5", 65000, 335, 21, 2022, true, 72, 7200);
    public static final Car bmwM8 = new SportsCar("BMW M8 Competition", 170000, 617, 15, 2022, "4.4L V8", 3.0, 190, "8-speed automatic");
    public static final Car bmwX3 = new SUV("BMW X3", 50000, 248, 25, 2022, true, 62, 4400);
    public static final Car bmwZ4 = new SportsCar("BMW Z4", 75000, 382, 26, 2022, "3.0L I6", 3.9, 155, "8-speed automatic");
}
