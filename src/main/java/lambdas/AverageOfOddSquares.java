import java.util.Arrays;

public class AverageOfOddSquares {
    public static double averageOfOddSquares(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 != 0) // Filter out odd numbers
                .mapToDouble(n -> n * n) // Square each odd number
                .average()                // Calculate the average
                .orElse(0);               // Default to 0 if no odd numbers found
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double average = averageOfOddSquares(numbers);
        System.out.println("Average of squares of odd numbers: " + average);
    }
}