package DDR.RFT;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AuthService authService = new AuthService();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Felhasználónév: ");
        String username = scanner.nextLine();

        System.out.print("Jelszó: ");
        String password = scanner.nextLine();

        boolean isAuthenticated = authService.login(username, password);

        if (isAuthenticated) {
            System.out.println("Sikeres bejelentkezés!");
        } else {
            System.out.println("Hibás felhasználónév vagy jelszó.");
        }

        scanner.close();
    }
}
