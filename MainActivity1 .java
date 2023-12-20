import java.util.Scanner;

public class LoginExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        String result = login(inputUsername, inputPassword);
        System.out.println(result);
    }

    public static String login(String username, String password) {
        // Assume a simple authentication mechanism for demonstration purposes
        String validUsername = "admin";
        String validPassword = "secretpassword";

        if (username.equals(validUsername) && password.equals(validPassword)) {
            return "Login successful";
        } else {
            // Insecure error message revealing information
            if (!username.equals(validUsername)) {
                return "Error: Invalid username";
            } else if (!password.equals(validPassword)) {
                return "Error: Invalid password";
            }
        }
        return "Unknown error";
    }
}
