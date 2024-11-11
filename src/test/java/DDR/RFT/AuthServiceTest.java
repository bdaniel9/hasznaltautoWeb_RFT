package DDR.RFT;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AuthServiceTest {

    @Test
    void testLoginWithValidCredentials() {

        AuthService authService = new AuthService();
        String username = "DDR";
        String password = "DDR";

        boolean result = authService.login(username, password);

        assertTrue(result, "A bejelentkezésnek sikeresnek kellett volna lennie a helyes felhasználónév és jelszó esetén.");
    }

    @Test
    void testLoginWithWrongPassword() {

        AuthService authService = new AuthService();
        String username = "DDR";
        String password = "wrongPassword";

        boolean result = authService.login(username, password);

        assertFalse(result, "A bejelentkezésnek sikertelennek kellett volna lennie hibás jelszó esetén.");
    }

    @Test
    void testLoginWithNonExistingUser() {

        AuthService authService = new AuthService();
        String username = "nonexistuser";
        String password = "DDR";

        boolean result = authService.login(username, password);

        assertFalse(result, "A bejelentkezésnek sikertelennek kellett volna lennie nem létező felhasználónév esetén.");
    }
}