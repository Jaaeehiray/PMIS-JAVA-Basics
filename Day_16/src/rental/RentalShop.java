
package rental;

import java.util.ArrayList;
import java.util.List;

public class RentalShop {
    private List<Vehicle> fleet;

    public RentalShop() {
        fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public Rental rent(String vehicleId, Customer customer, int days) {
        if (days <= 0) {
            throw new IllegalArgumentException(
                    "Days must be greater than zero"
            );
        }

        Vehicle selectedVehicle = null;

        for (Vehicle vehicle : fleet) {
            if (vehicle.getId().equals(vehicleId)) {
                selectedVehicle = vehicle;
                break;
            }
        }

        if (selectedVehicle == null) {
            throw new IllegalArgumentException(
                    "Vehicle " + vehicleId + " not found"
            );
        }

        if (!selectedVehicle.isAvailable()) {
            throw new IllegalStateException(
                    selectedVehicle.getVehicleName()
                            + " is already rented"
            );
        }

        Rental rental = new Rental(selectedVehicle, customer, days);

        selectedVehicle.setAvailable(false);
        customer.addRental(rental);

        return rental;
    }

    public void giveBack(String vehicleId) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getId().equals(vehicleId)) {
                if (vehicle.isAvailable()) {
                    throw new IllegalStateException(
                            vehicle.getVehicleName()
                                    + " is not currently rented"
                    );
                }

                vehicle.setAvailable(true);
                return;
            }
        }

        throw new IllegalArgumentException(
                "Vehicle " + vehicleId + " not found"
        );
    }

    public void showAvailable() {
        System.out.println("Available vehicles:");

        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailable()) {
                System.out.println(
                        "  " + vehicle.getVehicleName()
                );
            }
        }
    }
}
