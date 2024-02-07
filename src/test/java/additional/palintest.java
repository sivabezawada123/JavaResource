package additional;
import org.junit.Test;

public class palintest {

    @Test
    public void testPalindrome() {
        int[] numbers = {121, 12321, 1, 1234321, 123454321};

        for (int number : numbers) {
            if (palin.isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        }
    }

    @Test
    public void testNotPalindrome() {
        int[] numbers = {123, 1234, 123456};

        for (int number : numbers) {
            if (palin.isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        }
    }
}