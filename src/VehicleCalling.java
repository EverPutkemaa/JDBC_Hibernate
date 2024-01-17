import java.util.Scanner;

public class VehicleCalling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fuel amount in your vehicle");
        float fuelInput = scanner.nextFloat();

        System.out.println("Enter your vehicle's fuel usage per 100 km");
        float fuelUserInput = scanner.nextFloat();

        System.out.println("Enter how many passengers will be in vehicle");
        int passengersInput = scanner.nextInt();

        Vehicle myVehicle = new Vehicle(fuelInput, fuelUserInput, passengersInput);

      //  System.out.print("MaxDistance" + roundUpToTwoDecimals(myVehicle.maxDistance()));
        System.out.print("MaxDistance : " + roundUpToTwoDecimals(myVehicle.maxDistance(fuelInput, fuelUserInput, passengersInput))+ "km");

        scanner.close();
    }
        private static double roundUpToTwoDecimals(float value){ return Math.round(value * 100) / 100.0;    }
}
