package arrays;
public class Movezeros {
    public static void moveZeros(int[] nums) {
        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;


                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {

        int[] numbers = {0, 3, 0, 5, 12, 0, 8};

        System.out.println("Original Array:");
        printArray(numbers);

        // Move zeros to the end
        moveZeros(numbers);

        System.out.println("\nArray after moving zeros:");
        printArray(numbers);
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
