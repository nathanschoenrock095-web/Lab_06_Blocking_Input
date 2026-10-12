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

            if (width <= 0) {
                System.out.println("Width must be greater than 0.");
            }

        } while (width <= 0);

        do {
            System.out.print("Enter rectangle height: ");

            while (!input.hasNextDouble()) {
                System.out.println("Invalid input. Enter a number.");
                input.next();
            }

            height = input.nextDouble();

            if (height <= 0) {
                System.out.println("Height must be greater than 0.");
            }

        } while (height <= 0);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}