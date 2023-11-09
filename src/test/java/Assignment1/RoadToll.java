package Assignment1;

public class RoadToll {
	   // Member variables
    private String TypeOfVehicle;
    private int NumberOfTires;

    // Constructor
    public RoadToll(String TypeOfVehicle, int NumberOfTires) {
        this.TypeOfVehicle = TypeOfVehicle;
        this.NumberOfTires = NumberOfTires;
    }

    // Method to calculate Road Toll
    public double calculateToll() {
        if (NumberOfTires == 2) {
            return 0.00;
        } else if (NumberOfTires == 4) {
            return 50.00;
        } else {
            return 100.00;
        }
    }

    public static void main(String[] args) {
        // Create an object of RoadToll
        RoadToll vehicle1 = new RoadToll("Car", 4);
        RoadToll vehicle2 = new RoadToll("Truck", 6);
        RoadToll vehicle3 = new RoadToll("Bike", 2);

        // Calculate toll for each vehicle
        double toll1 = vehicle1.calculateToll();
        double toll2 = vehicle2.calculateToll();
        double toll3 = vehicle3.calculateToll();

        // Print out the toll amounts
        System.out.println("Toll for Vehicle 1 (Car with 4 tires): Rs. " + toll1);
        System.out.println("Toll for Vehicle 2 (Truck with 6 tires): Rs. " + toll2);
        System.out.println("Toll for Vehicle 3 (Bike with 2 tires): Rs. " + toll3);
    }



}
