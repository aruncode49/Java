// Note: now we have to reverse the actual number not just printing 

import java.util.Scanner;

public class Reverse_the_given_number {
    public static void main(String[] args) {
        int n;
        // taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();

        // now reverse the number
        int rn = 0;
        while (n != 0) {
            int ld = n % 10;
            rn = rn * 10 + ld;
            n /= 10;
        }
        System.out.println("Reverse number : " + rn);

    }
}
