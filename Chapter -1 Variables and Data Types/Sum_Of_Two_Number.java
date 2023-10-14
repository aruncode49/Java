import java.util.Scanner;

public class Sum_Of_Two_Number {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // input first number from user
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            int sum = number1 + number2;
            System.out.println(sum);
        }

    }
}
