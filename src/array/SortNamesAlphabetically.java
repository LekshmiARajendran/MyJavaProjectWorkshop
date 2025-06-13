package array;
import java.util.Arrays;
import java.util.Scanner;
public class SortNamesAlphabetically {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many names to enter? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline
        String[] names = new String[n];
        // Get names from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name #" + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        // Selection sort alphabetically (ascending)
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (names[j].compareTo(names[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = names[i];
            names[i] = names[minIndex];
            names[minIndex] = temp;
        }
        System.out.println("Sorted names (A to Z):");
        for (String name : names) {
            System.out.println(name);
        }
        //Sort ignoring case
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        System.out.println("\nSorted names (case-insensitive):");
        for (String name : names) {
            System.out.println(name);
        }
        scanner.close();
    }
}