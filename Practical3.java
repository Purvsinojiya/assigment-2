import java.util.Scanner;

    public class Practical3{
            void lastdigit() {
            int a, b;
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            if (b % 10 == a) {
                System.out.println("true");
            } else
                System.out.println("false");
        }
    public static void main(String[] args) {
        Practical3 obj1 = new Practical3();
        obj1.lastdigit();
    }
}
