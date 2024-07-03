/**
 * Main function to call all features.
 * @author Aditya Bankoti
 * @date July 1, 2024
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // BMW website with limited options
        Website bmwWebsite = new Website("BMW", "https://www.bmwusa.com/");
        bmwWebsite.addCars(
                DefaultCars.bmw330i, DefaultCars.bmwM8, DefaultCars.bmwM5, DefaultCars.bmwM3,
                DefaultCars.bmwX3, DefaultCars.bmwX5, DefaultCars.bmwZ4
        );

        // john is an old car collector selling his inventory. everything is new and untouched.
        Dealership facebookDude = new Dealership("John from Facebook");

        facebookDude.addCars(
                DefaultCars.mazdaMiata, DefaultCars.mazdaRx7, DefaultCars.chevyC5,
                DefaultCars.chevyC6, DefaultCars.nissan350z, DefaultCars.toyotaSupraMk4
        );

        // luxury car purchasing dealership!
        // "unparalleled luxury on wheels"
        Dealership luxuryCars = new Dealership("Luxury Car Dealership");
        luxuryCars.addCars(
                DefaultCars.porsche918, DefaultCars.bugattiChiron, DefaultCars.rollsRoyceGhost,
                DefaultCars.audiRs6, DefaultCars.audiR8
        );

        // cars for the average-joe that get you from point a to b without spending a fortune
        // everything is also new and untouched.
        Dealership carsConvenient = new Dealership("Cars Convenient");
        carsConvenient.addCars(
                DefaultCars.toyotaPrius, DefaultCars.toyotaRav4, DefaultCars.teslaModelS
        );

        // scanner for input
        Scanner scanner = new Scanner(System.in);

        // vendors
        Seller[] vendors = new Seller[]{bmwWebsite, facebookDude, carsConvenient};

        // welcome message
        System.out.println("Welcome to the dealership portal, " + System.getProperty("user.name") + "!");

        while (true) {
            // prompt w/ options
            System.out.println("Which vendor would you like to look at?");
            System.out.printf("[1-%d: vendor #] [q: quit]\n", vendors.length);

            // print each option
            for (int i = 0; i < vendors.length; i++) {
                System.out.printf("%d) %s\n", i + 1, vendors[i].toString());
            }

            // terminal prompt
            System.out.print("> ");

            // get vendor option
            int vendorOption = Utils.getInteger(scanner, vendors.length);

            // if it's an error code, restart the UI
            // if it's an exit, exit the program
            if (vendorOption == Utils.ERROR_CODE) {
                System.out.println("Please enter a valid number.");
                continue;
            } else if (vendorOption == Utils.EXIT_CODE) {
                break;
            }

            // store the vendor - 1 (b/c array starts at 0, user inputted normal index)
            Seller vendor = vendors[--vendorOption];

            // print available cars
            System.out.println("Here are the available cars:");
            int index = 1;
            for (Car car : vendor.getInventory()) {
                System.out.printf("%d) %s\n\n", index, car.toString());
                index++;
            }

            // provide prompt again
            System.out.println("Which would you like to buy?");
            System.out.printf("[1-%d: car #] [q: quit]\n", vendor.getInventory().size());
            System.out.print("> ");

            // store value
            int carChoice = Utils.getInteger(scanner, vendor.getInventory().size());
            if (carChoice == Utils.EXIT_CODE) {
                break;
            } else if (carChoice == Utils.ERROR_CODE) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            // stored ordered car
            Car orderedCar = vendor.getInventory().get(carChoice - 1);
            // print purchase message
            System.out.printf("\n== Purchased a%s %s for %s! ==\n\n",
                    Utils.isVowel(orderedCar.getName().charAt(0)) ? "n" : "",
                    orderedCar.getName(),
                    Utils.moneyToString(orderedCar.getPrice())
            );
            // order car (or remove it depending on seller)
            vendor.orderCar(orderedCar);
        }

        // exit message
        System.out.println("Thanks for coming, " + System.getProperty("user.name") + "!");
        // close scanner
        scanner.close();
    }
}
