// check wheather a given number is prime or not

import java.util.*;

public class Prime_number {
    public static void main(String[] args) {
        int n;
        // input number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        n = sc.nextInt();

        boolean isPrime = true;

        if (n == 1) {
            System.out.println("Not Prime");
        } else if (n == 2) {
            System.out.println("Prime Number");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not Prime");
            }
        }

    }
}
