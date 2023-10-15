import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args) {
        int a, b;
        char operator;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a: ");
            a = sc.nextInt();
            System.out.println("Enter b: ");
            b = sc.nextInt();
            System.out.println("Enter your operator: ");
            operator = sc.next().charAt(0);
            switch (operator) {
                case '+':
                    System.out.println("a+b: " + (a + b));
                    break;
                case '-':
                    System.out.println("a-b: " + (a - b));
                    break;
                case '*':
                    System.out.println("a*b: " + (a * b));
                    break;
                case '/':
                    System.out.println("a/b: " + (a / b));
                    break;
                default:
                    System.out.println("Enter correct operator!");
            }
        }
    }
}
