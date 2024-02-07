
package arrays;
public class Integerarray {
    static int[] num = {2, 5, 9, 11, 13, 25, 30};
    static int small = num[0];
    static int large = num[0];

    public static void largeandsmall() {
        for (int i = 1; i < num.length; i++) {
            if (num[i] < small) {
                small=num[i];
            }
            else if(num[i] > large)
            {
                large=num[i];
            }
        }
    }

    public static void main(String[] args) {
        largeandsmall();
        System.out.println("small number:"+small);
        System.out.println("large number:"+large);
    }
}
