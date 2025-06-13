package array;
import java.util.Scanner;
public class SortingProductsbyPrice {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of Products: ");
        int numOfProducts=scanner.nextInt();
        double[] prices= new double[numOfProducts];
        System.out.println("Enter the price for each product:");
        for (int i = 0; i < numOfProducts; i++) {
            prices[i] = scanner.nextDouble();
        }
        /*Bubble Sort works by repeatedly stepping through the list, comparing adjacent elements,
        and swapping them if they are in the wrong order.
        This process repeats until the list is fully sorted.*/
        // Bubble Sort prices in ascending order
        for (int i = 0; i < (numOfProducts -1); i++) {
            for (int j = 0; j < (numOfProducts -1) - i; j++) {
                if (prices[j] > prices[j + 1]) {
                    double temp = prices[j];
                    prices[j] = prices[j + 1];
                    prices[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted product prices in ascending order is ");
        for (double price : prices) {
            System.out.printf("$%.2f%n", price);
        }
        scanner.close();
    }
}

