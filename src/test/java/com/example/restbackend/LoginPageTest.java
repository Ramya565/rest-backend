import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginPageTest {

    @Test
    public void testGettersAndSetters() {
        // Create a LoginPage object
        LoginPage loginPage = new LoginPage("testUser", "testPassword");

        // Test the getters
        assertEquals("testUser", loginPage.getUsername());
        assertEquals("testPassword", loginPage.getPassword());

        // Test the setters
        loginPage.setUsername("newUser");
        loginPage.setPassword("newPassword");

        assertEquals("newUser", loginPage.getUsername());
        assertEquals("newPassword", loginPage.getPassword());
    }
}
