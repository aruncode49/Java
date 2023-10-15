import java.util.Scanner;

public class Sum_of_first_n_natural_numbers {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n > 0) {
            sum += n;
            n--;
        }
        System.out.println("Sum is: " + sum);
    }
}
