package loopexamples;
import java.util.Scanner;
public class LetterSearchinSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text:");
        String text = scanner.nextLine();
        scanner.close();
        boolean letterFound = false;
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }

        if (letterFound) {
            System.out.println("This text contains the letter 'A' or 'a'");
        } else {
            System.out.println("This text does not contain the letter");
        }
    }
}
