import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double gallons;
        double mpg;
        double price;

        do {
            System.out.print("Enter gallons of gas in tank: ");

            while (!input.hasNextDouble()) {
                System.out.println("Invalid input. Enter a number.");
                input.next();
            }

            gallons = input.nextDouble();

        } while (gallons <= 0);

        do {
            System.out.print("Enter miles per gallon: ");

            while (!input.hasNextDouble()) {
                System.out.println("Invalid input. Enter a number.");
                input.next();
            }

            mpg = input.nextDouble();

        } while (mpg <= 0);

        do {
            System.out.print("Enter price per gallon: ");

            while (!input.hasNextDouble()) {
                System.out.println("Invalid input. Enter a number.");
                input.next();
            }

            price = input.nextDouble();

        } while (price <= 0);

        double cost = (100 / mpg) * price;
        double distance = gallons * mpg;

        System.out.println("Cost to drive 100 miles: $" + cost);
        System.out.println("Distance with full tank: " + distance + " miles");
    }
}