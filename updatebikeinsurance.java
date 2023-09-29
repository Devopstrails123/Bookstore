import java.util.Scanner;

class BikeInsurance {
    private String ownerName;
    private String bikeModel;
    private double insuranceAmount;

    public BikeInsurance(String ownerName, String bikeModel, double insuranceAmount) {
        this.ownerName = ownerName;
        this.bikeModel = bikeModel;
        this.insuranceAmount = insuranceAmount;
    }

    public void updateInsuranceAmount(double newAmount) {
        this.insuranceAmount = newAmount;
        System.out.println("Insurance amount updated successfully!");
    }

    public void displayInsuranceDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Bike Model: " + bikeModel);
        System.out.println("Insurance Amount: $" + insuranceAmount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an initial bike insurance object
        BikeInsurance bikeInsurance = new BikeInsurance("John Doe", "Honda CB500", 500.0);

        // Display initial insurance details
        System.out.println("Initial Insurance Details:");
        bikeInsurance.displayInsuranceDetails();

        // Update insurance amount
        System.out.print("Enter new insurance amount: $");
        double newAmount = scanner.nextDouble();
        bikeInsurance.updateInsuranceAmount(newAmount);

        // Display updated insurance details
        System.out.println("\nUpdated Insurance Details:");
        bikeInsurance.displayInsuranceDetails();

        // Close the scanner
        scanner.close();
    }
}

