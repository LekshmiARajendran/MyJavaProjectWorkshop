package operatorexample;
import java.util.Scanner;
public class ChangeDollarGame {
    public static void main(String[] args){
        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;
        System.out.println("Enter your number of pennies:");
        Scanner scanner=new Scanner(System.in);
        int penniesCount= scanner.nextInt();
        System.out.println("Enter your number of nickels:");
        int nickelsCount = scanner.nextInt();
        System.out.println("Enter your number of dimes:");
        int dimesCount = scanner.nextInt();
        System.out.println("Enter your number of quarters:");
        int quartersCount = scanner.nextInt();
        scanner.close();
        double total = (penniesCount * penny) + (nickelsCount * nickel) + (dimesCount * dime) + (quartersCount * quarter);
        if(total < dollar){
            double amountShort = dollar - total;
            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose!" + String.format("%.2f", amountShort) + " cents.");
        }
        else if(total > dollar){
            double amountOver = total - dollar;
            System.out.println("Sorry, you lose!" + String.format("%.2f", amountOver) + " cents.");
        }
        else{
            System.out.println("Yay! That's exactly $1.00! You win!");
        }
    }
}
