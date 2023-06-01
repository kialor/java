import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DivideMethodTest {
    @DisplayName("Test divide() method")
    @Test
    void testDivide() {
        double expected = 1.0 / 3.0;
        double actual = DivideMethod.divide(1, 3);
        assertEquals(expected, actual);
    }
}