import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {
    @DisplayName("Test generateGreeting() method")
    @Test
    void testGenerateGreeting() {
        String name = "Joe";
        String expectedGreeting = "Hi Joe";
        String actualGreeting = Greeting.printGreeting(name);
        assertEquals(expectedGreeting, actualGreeting);
    }
}