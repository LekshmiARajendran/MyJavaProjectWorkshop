package nestedifexample;
import java.util.Scanner;
public class LoanForEmployee {
    public static void main(String[] args){
        //To qualify for a loan there are two conditions that must be met.
        // The person must make at least $30,000 and they must have also been at their job for 2 or more years.
        int minExperience= 2;
        int minSalary= 30000;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your year of experinece at the company: ");
        int experience= scanner.nextInt();
        System.out.println("Please enter your current Salary: ");
        int salary= scanner.nextInt();
        scanner.close();
        if(experience>=minExperience){
            if(salary>minSalary){
                System.out.println("Congratualations you are eligible for the loan");
            }
            else{
                System.out.println("Sorry,your current salary is " +salary+ "$ not eligible to apply for the Loan, eligible salary is " +minSalary+ "$");
            }
        }
        else{
            experience= minExperience-experience;
            System.out.println("Sorry, your experience in the company not met the minimum experience requirement, you need " +experience+ " more for applying the loan");
        }
    }
}
