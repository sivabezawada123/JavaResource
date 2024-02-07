package loops;
public class Age {
 static int age;
 public static void teen(int age) {
     if (age > 13 && age < 19) {
         System.out.println("Person is teen");
     }
 }
public static void kid(int age) {
    if (age < 13) {
        System.out.println("Person is kid");
    }
}
 public static void adult(int age) {
     if (age > 19) {
         System.out.println("person is adult");
     }
 }
public static void main(String[] args)
{
    age=15;
teen(age);
kid( age);
adult( age);
}
}