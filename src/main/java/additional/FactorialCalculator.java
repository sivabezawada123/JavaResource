package additional;


public class FactorialCalculator {
    public static int findfactorial(int num) {

        if (num == 0 || num == 1)
            return 1;
        else
            return num * findfactorial(num - 1);
    }

}
