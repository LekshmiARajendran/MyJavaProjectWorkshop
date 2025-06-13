package loopexamples;
import java.util.Scanner;
public class SumTwoNumbersLoop {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        boolean loopStartOver;
        do{
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double sum = num1 + num2;
            System.out.println("The sum is " + sum);
            System.out.println("Would you like to start over? True or False");
            loopStartOver = scanner.nextBoolean();

        } while(loopStartOver);

        scanner.close();
    }
}
