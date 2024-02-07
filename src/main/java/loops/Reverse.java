package loops;
public class Reverse {
static int s=123456789;
    public static void reverse() {
        while (s != 0) {
            int k = s % 10;
            System.out.print(k);
            s = s / 10;
        }
    }
public static void main(String[] args)
    {
        reverse();
    }
}
