import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();

        double temperature;
        double converted;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                converted = (temperature * 9/5) + 32;
                System.out.printf("%.2f °C = %.2f °F%n", temperature, converted);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                converted = (temperature - 32) * 5/9;
                System.out.printf("%.2f °F = %.2f °C%n", temperature, converted);
                break;
            default:
                System.out.println("Invalid option. Please run the program again.");
        }

        scanner.close();
    }
}
