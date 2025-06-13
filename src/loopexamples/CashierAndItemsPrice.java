package loopexamples;
import java.util.Scanner;
public class CashierAndItemsPrice {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no.of items needed to scan: ");
        int count=scanner.nextInt();
        double totalAmount=0;
        for(int i=0;i<count;i++){
            System.out.println("Enter the cost of each products:");
            double costOfProduct=scanner.nextDouble();
            totalAmount= totalAmount+costOfProduct;
        }
        scanner.close();
        System.out.println("The total amount of the purchase is: " +totalAmount);
    }

}
