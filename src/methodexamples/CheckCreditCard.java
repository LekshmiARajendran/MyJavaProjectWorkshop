package methodexamples;
import java.util.Scanner;
/*
 * VARIABLE SCOPE
 * Write an ‘instant credit check’ program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */
public class CheckCreditCard {
    static Scanner scanner= new Scanner(System.in);
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        boolean qualified = isUserQualified(creditScore, salary);
        notifyUser(qualified);
        scanner.close();
    }
    public static double getSalary(){
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
    //check whether qualified or not
    public static boolean isUserQualified(int creditScore, double salary){
        return(creditScore >= requiredCreditScore && salary >= requiredSalary);
        //changed 'if-else' with simple 'return' statement
    }
    public static void notifyUser(boolean isQualified) {
        if (isQualified) {
            System.out.println("Congrats! You've been approved.");
        } else {
            System.out.println("Sorry, You've been declined");
        }
    }
}
