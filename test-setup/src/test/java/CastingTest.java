import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CastingTest {

    @DisplayName("Test getDoubleValue()")
    @Test
    public void testGetDoubleValue() {
        Casting casting = new Casting();
        double expectedValue = 112.35;
        double actualValue = casting.getDoubleValue();
        assertEquals(expectedValue, actualValue);
    }

    @DisplayName("Test getIntValue()")
    @Test
    public void testGetIntValue() {
        Casting casting = new Casting();
        double inputValue = 112.35;
        int expectedValue = 112;
        int actualValue = casting.getIntValue(inputValue);
        assertEquals(expectedValue, actualValue);
    }

    @DisplayName("Test getStringValue()")
    @Test
    public void testGetStringValue() {
        Casting casting = new Casting();
        String expectedValue = "49";
        String actualValue = casting.getStringValue();
        assertEquals(expectedValue, actualValue);
    }

    @DisplayName("Test parseStringToInt()")
    @Test
    public void testParseStringToInt() {
        Casting casting = new Casting();
        String inputString = "49";
        int expectedValue = 49;
        int actualValue = casting.parseStringToInt(inputString);
        assertEquals(expectedValue, actualValue);
    }
}
