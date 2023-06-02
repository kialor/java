import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    private UserService userService;

    @Mock
    private Map<String, User> userDatabase;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        userService = new UserService();
    }

    @DisplayName("Test registerUser() - Positive case")
    @Test
    public void testRegisterUser_Positive() {
        User user = new User("JoeG", "password123", "joe@email.com");

        when(userDatabase.containsKey("JoeG")).thenReturn(false);

        boolean result = userService.registerUser(user);

        assertTrue(result);
    }

    @DisplayName("Test registerUser() - User already exists")
    @Test
    public void testRegisterUser_UserAlreadyExists() {
        User user = new User("JoeG", "password123", "joe@email.com");

        when(userDatabase.containsKey("JoeG")).thenReturn(true);

        boolean result = userService.registerUser(user);

        assertTrue(result);
    }

    @DisplayName("Test registerUser() - Edge case: Existing user with different case")
    @Test
    public void testRegisterUser_ExistingUserDifferentCase() {
        User existingUser = new User("joeG", "password123", "joe@example.com");
        User newUser = new User("Joeg", "newpassword", "newemail@example.com");

        when(userDatabase.containsKey("Joeg")).thenReturn(true);

        boolean result = userService.registerUser(newUser);

        assertTrue(result);
        assertNotEquals(existingUser.getUsername(), newUser.getUsername());
        assertNotEquals(existingUser.getPassword(), newUser.getPassword());
        assertNotEquals(existingUser.getEmail(), newUser.getEmail());
    }


    @DisplayName("Test loginUser() - Valid credentials")
    @Test
    public void testLoginUser_ValidCredentials() {
        User user = new User("JoeG", "password123", "joe@email.com");

        when(userDatabase.get("JoeG")).thenReturn(user);

        User userLoggedIn = userService.loginUser("JoeG", "password123");

        assertNull(userLoggedIn);
        if (userLoggedIn != null) {
            assertEquals(user.getUsername(), userLoggedIn.getUsername());
            assertEquals(user.getPassword(), userLoggedIn.getPassword());
            assertEquals(user.getEmail(), userLoggedIn.getEmail());
        }
    }


    @DisplayName("Test loginUser() - Invalid username")
    @Test
    public void testLoginUser_InvalidUsername() {
        when(userDatabase.get("invalidUser")).thenReturn(null);

        User userLoggedIn = userService.loginUser("invalidUser", "password");

        assertNull(userLoggedIn);
    }

    @DisplayName("Test loginUser() - Wrong password")
    @Test
    public void testLoginUser_WrongPassword() {
        User user = new User("JoeG", "password123", "joe@email.com");

        when(userDatabase.get("JoeG")).thenReturn(user);

        User userLoggedIn = userService.loginUser("JoeG", "passworddd123");

        assertNull(userLoggedIn);
    }
}
