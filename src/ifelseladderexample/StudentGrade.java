package ifelseladderexample;
import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your mark");
        int mark= scanner.nextInt();
        scanner.close();
        char grade;
        if(mark<60){
            grade= 'F';
            System.out.println("Your grade is "+grade);
        } else if (mark<70) {
            grade= 'D';
            System.out.println("Your grade is "+grade);
        } else if (mark<80) {
            grade= 'C';
            System.out.println("Your grade is "+grade);
        }
        else if(mark<90){
            grade= 'B';
            System.out.println("Your grade is "+grade);
        }
        else{
            grade='A';
            System.out.println("Your grade is "+grade);
        }
    }
}
