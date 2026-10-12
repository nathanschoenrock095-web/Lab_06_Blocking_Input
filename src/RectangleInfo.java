import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double width;
        double height;

        do {
            System.out.print("Enter rectangle width: ");

            while (!input.hasNextDouble()) {
                System.out.println("Invalid input. Enter a number.");
                input.next();
            }

            width = input.nextDouble();

        } while (width <= 0);

        do {
            System.out.print("Enter rectangle height: ");

            while (!input.hasNextDouble()) {
                System.out.println("Invalid input. Enter a number.");
                input.next();
            }

            height = input.nextDouble();

        } while (height <= 0);

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
