package methodandconstructor;
import java.util.Scanner;
public class PhoneBillCalculation {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter phone bill ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter base cost: ");
        double baseCost = scanner.nextDouble();
        System.out.print("Enter allotted minutes: ");
        int allottedMinutes = scanner.nextInt();
        System.out.print("Enter minutes used: ");
        int minutesUsed = scanner.nextInt();
        scanner.close();
        PhoneBill bill= new PhoneBill(id,baseCost,allottedMinutes,minutesUsed);
        System.out.println("Itemized Bill");
        bill.printItemizedBill();
    }
}
