package loops;
public class Pattern {
    public static void main(String[] args) {
        int m = 7, n = 7, k = n-2;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j < k)
                    System.out.print("+");
                else
                    System.out.print("-");
            }
                    k--;
                    System.out.println();

            }
        }
    }

