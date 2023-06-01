import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

class CountToElevenTest {
    @DisplayName("Test generateNumbers() method")
    @Test
    void testGenerateNumbers() {
        int value = 8;
        List<Integer> expectedNumbers = Arrays.asList(8, 9, 10, 11);
        List<Integer> actualNumbers = CountToEleven.generateNumbers(value);
        assertEquals(expectedNumbers, actualNumbers);
    }
}
