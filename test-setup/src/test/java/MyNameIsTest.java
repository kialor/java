import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyNameIsTest {
    @DisplayName("Test printName() method")
    @Test
    void testMyNameIs(){
        String expectedOutput = "My name is\nLarry\nSprinkle";
        String actualOutput = MyNameIs.printName();
        assertEquals(expectedOutput, actualOutput);
    }
}
