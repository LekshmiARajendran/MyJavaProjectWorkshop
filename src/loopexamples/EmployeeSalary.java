package loopexamples;
import java.util.Scanner;
public class EmployeeSalary {
    public static void main(String[] args){
        int ratePerHour=15;
        int maxWorkingHour=40;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many hours did you work in this week?");
        double hoursWorked = scanner.nextDouble();
        if((hoursWorked>maxWorkingHour)||(hoursWorked<1)){
            System.out.println("Sorry,invalid input.Try again");
            /*A sentinel is a variable used within the condition that controls the loop.
            It's very important that somewhere in your loops there's an opportunity for the sentinel to be updated.
            Otherwise, this loop will run infinitely.*/
            hoursWorked=scanner.nextDouble();
        }
        scanner.close();
        double salary=ratePerHour*hoursWorked;
        System.out.println("The salary of Employee is " +salary);
    }
}
