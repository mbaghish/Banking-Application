package Main;

import Authentication.UserAuthentication;

public class Main {
    public static void main(String[] args)
    {
        UserAuthentication auth = new UserAuthentication();

        // Register a new user
        auth.registerUser("john_doe", "secret123");

        // Authenticate a user
        String username = "john_doe";
        String password = "secret123";
        if (auth.authenticateUser(username, password)) {
            System.out.println("Authentication successful.");
        } else {
            System.out.println("Authentication failed.");
        }
    }
}
