import java.util.Scanner;

public class Calculate_Income_Tax {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your income : ");
            int income = sc.nextInt();
            int tax = 0;
            if (income < 500000) {
                tax = 0;
            } else if (income >= 500000 && income <= 1000000) {
                tax = (int) (income * 0.2);
            } else if (income > 1000000) {
                tax = (int) (income * 0.3);
            }
            System.out.println("Tax is : " + tax);
        }
    }
}