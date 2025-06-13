package exceptionhandling;
import java.util.Scanner;
public class DivisonByZeroDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number to divide 30 by: ");
            int denominator = Integer.parseInt(scanner.nextLine());

            // This line can throw ArithmeticException if denominator is 0
            int result = 30 / denominator;

            System.out.println("Result of 30 / " + denominator + " = " + result);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero is not allowed!");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Please enter a valid integer!");
        } finally {
            scanner.close();
            System.out.println("Program ended.");
        }
    }
}
