package arrays;
public class Rotate {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int x = 2;

        System.out.println("Original Array:");
        printArray(arr);
        rotateLeft(arr, x);

        System.out.println("\nArray after rotating left by " + x + " positions:");
        printArray(arr);
    }

    public static void rotateLeft(int[] arr, int x) {
        int n = arr.length;
        x = x % n;

        reverseArray(arr, 0, x - 1);

        reverseArray(arr, x, n - 1);

        reverseArray(arr, 0, n - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices toward the center
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}