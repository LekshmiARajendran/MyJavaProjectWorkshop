package ifelseexample;
import java.util.Scanner;
public class SalesEmployeesMessage {
 public static void main(String[] args){
     //Minimum Sales count is 10
     int minCount=10;
     System.out.println("Please enter the sales count of this week: ");
     Scanner scanner= new Scanner(System.in);
     int salesCount= scanner.nextInt();
     scanner.close();
     if(salesCount>minCount){
         System.out.println("Congratulations you achieved your Sales target.");
     }
     else {
         salesCount=minCount-salesCount;
         System.out.println("Sorry you have " +salesCount+ " more sales to achieve.");
     }
 }
}
