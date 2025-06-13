package string;

import java.util.Scanner;

/* Check the password Rules. 1. must be at least eight characters long,
2.contain an uppercase letter,
3.contain a special character,
4.not contain the username and
5.not be the same as the old password.
 */
public class CheckPassword {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        // Get the username
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        // Get the old password
        System.out.print("Enter your old password: ");
        String oldPassword = scanner.nextLine();
        // Get the new password
        System.out.print("Enter your new password: ");
        String newPassword = scanner.nextLine();
        //Validate the new password
        if (isValidPassword(newPassword, username, oldPassword)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid. Please follow the password rules.");
        }
        scanner.close();
    }
    public static boolean isValidPassword(String password, String username, String oldPassword) {
        // Rule 1: At least eight characters long
        if (password.length() < 8) {
            System.out.println("Password must be at least eight characters long.");
            return false;
        }
        // Rule 2: Contains at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Password must contain at least one uppercase letter.");
            return false;
        }
        // Rule 3: Contains at least one special character (e.g., !@#$%^&*()-+)
        if (!password.matches(".*[!@#$%^&*()\\-+].*")) {
            System.out.println("Password must contain at least one special character.");
            return false;
        }
        // Rule 4: Does not contain the username
        if (password.toLowerCase().contains(username.toLowerCase())) {
            System.out.println("Password must not contain the username.");
            return false;
        }

        // Rule 5: Not the same as the old password
        if (password.equals(oldPassword)) {
            System.out.println("Password must not be the same as the old password.");
            return false;
        }
        return true;
    }
}
