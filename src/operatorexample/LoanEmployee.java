package operatorexample;
import java.util.Scanner;
public class LoanEmployee {
    public static void main(String[] args){
        int minExperience= 2;
        int minSalary= 30000;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your year of experinece at the company: ");
        int experience= scanner.nextInt();
        System.out.println("Please enter your current Salary: ");
        int salary= scanner.nextInt();
        scanner.close();
        if((experience>=minExperience) && (salary>=minSalary)){
            System.out.println("Congratualation, you are eligible for the Loan");
        }
        else{
            System.out.println("Sorry,you are not eligible for the loan");
        }
    }
}
