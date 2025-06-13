package exceptionhandling;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
 * Program: GradeHandler
 *
 * Summary:
 * This program demonstrates exception handling in Java using try-catch, multiple catch blocks,
 * throw keyword for custom exceptions, and finally block. It simulates a real-world scenario
 * where user inputs a student's name and grade. The program validates the grade and writes it
 * to a file if valid. If invalid input or errors occur, appropriate exceptions are caught and handled.
 *
 * Key concepts covered:
 * - Custom exception creation and throwing
 * - Handling multiple exceptions with separate catch blocks
 * - Use of finally block to clean up resources
 * - File writing with exception handling
 */
class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);  // Pass message to Exception superclass
    }
}

public class GradeHandler {
    // Method to validate and save grade to a file
    public static void saveGrade(String studentName, int grade) throws InvalidGradeException, IOException {
        // Check if grade is outside 0-100 range
        if (grade < 0 || grade > 100) {
            // Throw custom exception if invalid grade
            throw new InvalidGradeException("Grade must be between 0 and 100. You entered: " + grade);
        }

        // Try-with-resources to write the grade to file (appends to file)
        try (FileWriter fw = new FileWriter("grades.txt", true)) {
            fw.write(studentName + ": " + grade + "\n");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner for user input

        try {
            // Prompt user for student name
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            // Prompt user for grade input (as string), then parse to int
            System.out.print("Enter grade (0-100): ");
            int grade = Integer.parseInt(scanner.nextLine());

            // Call method to validate and save the grade (may throw exceptions)
            saveGrade(name, grade);

            // If no exceptions, print success message
            System.out.println("Grade saved successfully!");

        } catch (InvalidGradeException e) {
            // Handle invalid grade input (custom exception)
            System.out.println("InvalidGradeException caught: " + e.getMessage());
        } catch (NumberFormatException e) {
            // Handle non-integer grade input
            System.out.println("NumberFormatException caught: Please enter a valid integer for grade.");
        } catch (IOException e) {
            // Handle file writing errors
            System.out.println("IOException caught: Error writing to file.");
        } catch (Exception e) {
            // Catch any other unforeseen exceptions
            System.out.println("General exception caught: " + e.getMessage());
        } finally {
            // Always close scanner and print program completion message
            scanner.close();
            System.out.println("Program finished.");
        }
    }
}
