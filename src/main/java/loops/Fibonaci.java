package loops;
public class Fibonaci {
    static int l=0,m=1,k,i,N=10;
    public static void fibonaci(int N){
        for(i=0;i<N;i++)
        {
            System.out.println(l + " ");
            k=l+m;
            l=m;
            m=k;
        }

        }
        public static void main(String[] args)
        {

             fibonaci(N);
        }
}
