package methodexamples;
/*allow the user to input the plan fee and the number of overage minutes.
and then you're going to charge 25 cents for every minute that they've gone over,
and then a 15% tax on the subtotal*/
import java.util.Scanner;
public class CustomerPhoneBillCalculator {
    static Scanner scanner= new Scanner(System.in);
    static double chargeAmount=0.25;
    static double tax= 0.15;
    public static void main(String[] args){
        double basePlan=getPlanFee();
        double overageMinutes=getOverageMinutes();
        double overtimeCalculator=calculateOverTime(overageMinutes);
        double subTotalBill= subTotal(basePlan,overtimeCalculator);
        double taxAmount= taxCalculator(subTotalBill);
        double totalBillCustomer= totalBill(subTotalBill,taxAmount);
        printBill(basePlan,overageMinutes,subTotalBill,taxAmount,totalBillCustomer);

    }
    public static double getPlanFee(){
        System.out.println("Enter your base plan: ");
        return scanner.nextDouble();
    }
    public static double getOverageMinutes(){
        System.out.println("Enter the no.of overage minutes:");
        return scanner.nextDouble();
    }
    public static double calculateOverTime(double overageMinutes){
        return (overageMinutes * chargeAmount);
    }
    public static double subTotal(double basePlan, double overtimeCalculator){
        return (overtimeCalculator+basePlan);
    }
    public static double taxCalculator(double subTotal){
        return (subTotal * tax);
    }
    public static double totalBill(double subTotalBill, double taxAmount){
        return (subTotalBill + taxAmount);
    }
    public static void printBill(double basePlan, double overageMinutes, double subTotalBill, double taxAmount, double totalBillCustomer){
        System.out.println("The base plan of the customer is $ "+basePlan);
        System.out.println("The no.of overage minutes by the customer is $ "+overageMinutes);
        System.out.println("The sub total amount of the customer is $ "+subTotalBill);
        System.out.println("The tax calculated for the customer is $ "+taxAmount);
        System.out.println("The total bill of the customer is $ " +totalBillCustomer);
    }

}
