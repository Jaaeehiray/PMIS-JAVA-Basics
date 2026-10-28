
package rental;

public class Rental {
    private Vehicle vehicle;
    private Customer customer;
    private int days;
    private double rentAmount;

    public Rental(Vehicle vehicle, Customer customer, int days) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
        this.rentAmount = vehicle.calculateRent(days);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }

    public double getRentAmount() {
        return rentAmount;
    }
}
