import java.util.Scanner;

public class Taking_input_unitl_multiple_of_10 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your number: ");
            n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println("Number : " + n);
        }
        System.out.println("Program End!");
    }
}
