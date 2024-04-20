import java.util.HashMap;
import java.util.Scanner;

public class UserLogin {
    // User database (for demonstration purposes)
    private static HashMap<String, String> userDatabase = new HashMap<>();

    static {
        // Add some sample users to the database
        userDatabase.put("john_doe", "password123");
        userDatabase.put("jane_smith", "qwerty456");
        userDatabase.put("admin", "admin@123");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (validateCredentials(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }

        scanner.close();
    }

    private static boolean validateCredentials(String username, String password) {
        // Check if the username exists in the database and if the password matches
        return userDatabase.containsKey(username) && userDatabase.get(username).equals(password);
    }
}
