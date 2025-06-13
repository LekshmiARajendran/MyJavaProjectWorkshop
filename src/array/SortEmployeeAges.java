package array;
import java.util.Scanner;
public class SortEmployeeAges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int numOfEmployees = scanner.nextInt();
        int[] ages = new int[numOfEmployees];
        System.out.println("Enter the age of each employee:");
        for (int i = 0; i < numOfEmployees; i++) {
            ages[i] = scanner.nextInt();
        }
            // Insertion sort ages ascending
            for (int i = 1; i < numOfEmployees; i++) {
                int key = ages[i];
                int j = i - 1;
                while (j >= 0 && ages[j] > key) {
                    ages[j + 1] = ages[j];
                    j--;
                }
                ages[j + 1] = key;
            }
            System.out.println("Employee ages sorted (youngest to oldest):");
            for (int age : ages) {
                System.out.print(age + " ");
            }
            scanner.close();
        }
}