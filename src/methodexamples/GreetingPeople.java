package methodexamples;
import java.util.Scanner;
public class GreetingPeople {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name=scanner.next();
        scanner.close();
        greetPeople(name);

    }
    public static void greetPeople(String name){
        System.out.println("Hi " +name+ " How are you?");
    }
}
