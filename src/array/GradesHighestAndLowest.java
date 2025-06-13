package array;
/*
 * Create a program that allows a user to enter any
 * number of grades and provides them with their
 * average score, as well as the highest and lowest scores.
 */
import java.util.Scanner;
public class GradesHighestAndLowest {
    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("How many grades would you like to enter?");
        grades = new int[scanner.nextInt()];
        getGrades();
        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: " + getLowest());
    }
    public static void getGrades(){
        for(int i=0; i <grades.length; i++){
            System.out.println("Enter grade: " + (i+1));
            grades[i] = scanner.nextInt();
        }
    }
    public static int calculateSum() {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        return sum;
    }

    public static double calculateAverage(){
        return (calculateSum()/grades.length);
    }
    public static int getHighest() {
        int highest = grades[0];

        // Traditional for-loop to go through each index of the grades array
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > highest) {
                highest = grades[i];
            }
        }

        return highest;
    }
    public static int getLowest() {
        int lowest = grades[0];

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        return lowest;
    }

}

