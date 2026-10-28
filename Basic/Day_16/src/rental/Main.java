
package rental;

public class Main {
    public static void main(String[] args) {
        RentalShop shop = new RentalShop();

        // Create vehicles
        shop.addVehicle(new Car("C1", "Swift", 2000));
        shop.addVehicle(new Bike("B1", "Activa", 400));
        shop.addVehicle(new Truck("T1", "Tata Ace", 2500));

        // Create customers
        Customer asha = new Customer("Asha");
        Customer ravi = new Customer("Ravi");

        // Asha rents a bike for 8 days
        Rental rental1 = shop.rent("B1", asha, 8);

        System.out.printf(
                "%s rented %s for %d days = %.2f%n",
                rental1.getCustomer().getName(),
                rental1.getVehicle().getVehicleName(),
                rental1.getDays(),
                rental1.getRentAmount()
        );

        // Ravi rents a truck for 2 days
        Rental rental2 = shop.rent("T1", ravi, 2);

        System.out.printf(
                "%s rented %s for %d days = %.2f%n",
                rental2.getCustomer().getName(),
                rental2.getVehicle().getVehicleName(),
                rental2.getDays(),
                rental2.getRentAmount()
        );

        // Try renting the same bike again
        try {
            shop.rent("B1", ravi, 3);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Return the bike
        shop.giveBack("B1");

        // Display available vehicles
        shop.showAvailable();
    }
}
