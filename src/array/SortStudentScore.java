package array;
import java.util.Scanner;
public class SortStudentScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numOfStudents = scanner.nextInt();
        int[] scores = new int[numOfStudents];
        System.out.println("Enter the scores of each student:");
        for (int i = 0; i < numOfStudents; i++) {
            scores[i] = scanner.nextInt();
        }
        // Selection Sort scores ascending
        for (int i = 0; i < (numOfStudents - 1); i++) {
            int minIndex = i; //minIndex holds the index of smallest element found so far in the unsorted array
            for (int j = i + 1; (j < numOfStudents); j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j; //updates new smallest element with the new index value of j
                }
            }
            /*
            After finding the smallest element's index (minIndex) in the unsorted part,
            swap it with the element at the current i position.*/

            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }

        System.out.println("Student scores sorted (lowest to highest):");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        scanner.close();
    }
}