import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter temperature in Celsius: ");

            if (input.hasNextDouble()) {
                double celsius = input.nextDouble();

                double fahrenheit = (celsius * 9 / 5) + 32;

                System.out.println("Fahrenheit: " + fahrenheit);
            }
            else {
                input.next();
                System.out.println("Invalid input. Enter a number.");
            }
        }
    }
}
