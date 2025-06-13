package simpleifprogram;
import java.util.Scanner;
public class PaymentSalesEmployees {
    public static void main(String[] args){
        //Fixed sales amount getting for employees:1000$
        int payment=1000;
        //additional bonus amount getting for employee=250$
        int additionalBonus=250;
        //condition to get additional amount is Sales morethan 10
        int salesNumber=10;
        System.out.println("Please enter your sales count:");
        Scanner scanner=new Scanner(System.in);
        int count= scanner.nextInt();
        scanner.close();
        if(count>salesNumber){
            payment= payment + additionalBonus;
        }
        System.out.println("The payment for this employee is $" +payment);
    }
}
