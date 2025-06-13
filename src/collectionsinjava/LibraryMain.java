package collectionsinjava;
import java.util.*;
/**
 * LibraryApp manages a simple library collection.
 *
 * It demonstrates:
 * - Use of inheritance (Book and EBook classes)
 * - Polymorphism via overridden methods
 * - Collections (List) to store objects
 * - Looping through collections
 * - Taking user input to add books dynamically
 *
 * User can input book details via console, and the app adds
 * either a normal Book or an EBook to the library list.
 */
public class LibraryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> library = new ArrayList<>();

        System.out.println("Welcome to the Library Manager!");
        System.out.println("You can add normal Books or EBooks.");
        System.out.println("Enter 'exit' as title to stop.");

        while (true) {
            System.out.print("\nEnter book title (or 'exit' to finish): ");
            String title = scanner.nextLine();
            if (title.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter author name: ");
            String author = scanner.nextLine();

            System.out.print("Is this an EBook? (yes/no): ");
            String isEbook = scanner.nextLine();

            if (isEbook.equalsIgnoreCase("yes")) {
                System.out.print("Enter download URL: ");
                String url = scanner.nextLine();
                library.add(new EBook(title, author, url));
            } else {
                library.add(new Book(title, author));
            }

            System.out.println("Book added successfully!");
        }

        System.out.println("\nLibrary Collection:");
        for (Book book : library) {
            book.displayInfo();
            System.out.println("---");
        }

        scanner.close();
    }
}
