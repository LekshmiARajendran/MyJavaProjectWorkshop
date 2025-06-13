package firstprograms;
import java.util.Scanner;
public class GrossPayCalculator {
    public static void main(String[] args){
        //1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked:");
        Scanner scanner= new Scanner(System.in);
        int hoursWorked= scanner.nextInt();
        //2.Get the hourly payrate
        System.out.println("Enter the employee's payrate:");
        double hourlyPayrate=scanner.nextDouble();
        scanner.close();
        //3. Multiply hours and Payrate
        double grossPay= hoursWorked * hourlyPayrate;
        //4. Display the Result
        System.out.println("The Gross Pay of the employee is "+grossPay);
    }
}
