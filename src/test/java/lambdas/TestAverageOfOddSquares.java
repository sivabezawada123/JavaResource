package lambdas;

public class TestAverageOfOddSquares {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {2, 4, 6, 8, 10};

        double average1 = AverageOfOddSquares.averageOfOddSquares(numbers1);
        double average2 = AverageOfOddSquares.averageOfOddSquares(numbers2);

        System.out.println("Average of squares of odd numbers in numbers1: " + average1);
        System.out.println("Average of squares of odd numbers in numbers2: " + average2);
    }
}