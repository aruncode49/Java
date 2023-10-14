// 1. input your first name and print in next line;
// 2. input your first and last name and print in the same line

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            // 1.Ans
            // System.out.println("Enter your first name: ");
            // String firstName = sc.next();
            // System.out.println(firstName);

            // 2.Ans
            System.out.print("Enter your full name: ");
            String fullName = sc.nextLine();
            System.out.println(fullName);
        }

    }
}
