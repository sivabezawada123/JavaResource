package oops;
public class Overloading {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(add(2,3));
        System.out.println(add(2,3,4));
    }

    public static int add(int a , int b) {
        return a+b;
    }

    public static int add(int a , int b , int c) {
        return a+b+c;
    }
}