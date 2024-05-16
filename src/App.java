import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter three numbers: ");
        // double num1 = input.nextDouble();
        // double num2 = input.nextDouble();
        // double num3 = input.nextDouble();
        // double result = average(num1, num2, num3);
        // System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 +
        // " is " + result);
        // input.close();

        ArrayList<Double> numbers = new ArrayList<>();
        System.out.println(
                "Enter the number of numbers you want to average, press Enter after each value or leave empty to end: ");
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break; // Exit the loop if the user enters an empty line
            }
            try {
                double value = Double.parseDouble(input);
                numbers.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid double value.");
            }
        }

        scanner.close();

        // Call a method with the array of values (you can replace this with your actual
        // method)
        double result2 = average(numbers);
        if (numbers.size() == 0) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("The average of the numbers is: " + result2);
        }

    }

    public static double average(double a, double b, double c) {
        double average = (a + b + c) / 3;
        return average;
    }

    // Better way to calculate average of any number of numbers
    public static double average(ArrayList<Double> numbersToAverage) {
        double sum = 0;
        for (double number : numbersToAverage) {
            sum += number;
        }
        return sum / numbersToAverage.size();
    }
}
