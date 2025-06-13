package array;
import java.util.Scanner;
public class SortBookISBNNumbers {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = scanner.nextInt();
        int[] isbnNumbers = new int[n];

        System.out.println("Enter ISBN numbers:");
        for (int i = 0; i < n; i++) {
            isbnNumbers[i] = scanner.nextInt();
        }

        quickSort(isbnNumbers, 0, n - 1);

        System.out.println("Sorted ISBN numbers:");
        for (int num : isbnNumbers) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
