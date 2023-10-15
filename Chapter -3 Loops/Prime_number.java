// check wheather a given number is prime or not

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        int n, i = 0;
        // input number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        n = sc.nextInt();

        if (n < 2) {
            System.out.println("Not Prime");
        }

        // check prime or not
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Not Prime Number");
                break;
            }
        }

        // check how we comes out from the loop, from break or not
        if (i == n) {
            System.out.println("Prime Number");
        }

    }
}
