package HashSet;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

public class StringManipulatorTest {

    @Test
    public void testRemoveDuplicates() {
        String input = "hello world";
        String expectedOutput = "helo wrd";
        String actualOutput = removeDuplicates(input);
        assertEquals(expectedOutput, actualOutput);
    }

    private String removeDuplicates(String input) {
        Set<Character> uniqueChars = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (uniqueChars.add(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}