import java.util.Scanner;

public class Largest_of_three {
    public static void main(String[] args) {
        int a, b, c;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if (a >= b && a >= c) {
                System.out.println(a);
            } else if (b >= c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}
