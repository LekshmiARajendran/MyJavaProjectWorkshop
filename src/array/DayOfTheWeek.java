package array;
import java.util.Scanner;
public class DayOfTheWeek {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String[] week={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println("Enter a number from 1 to 7 in corresponding to the Week from Monday to Sunday: ");
        int dayNumber=scanner.nextInt();
        if(dayNumber>=1 && dayNumber<=7){
            System.out.println("You entered number is " +dayNumber+ " so the corresponding day in the week is " +week[dayNumber-1]);
        }
        else{
            System.out.println("Sorry you entered number is " +dayNumber+ " not within the range, you can try again with a valid number between 1 to 7");
        }
        scanner.close();
    }
}
