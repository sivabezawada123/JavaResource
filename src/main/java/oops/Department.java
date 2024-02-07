package oops;
public abstract class Department {


    abstract int getDepartmenSize();

    public static void main(String[] args) {

        SubDepartment sub1 = new SubDepartment();

        System.out.println("The Department Size is "+ sub1.getDepartmenSize());

    }
}

