import java.util.Scanner;

public class Average_of_three_numbers {
    public static void main(String[] args) {
        // first input three numbers
        try (Scanner sc = new Scanner(System.in)) {
            float a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            // calculate average
            float average = (a + b + c) / 3;
            // print answer
            System.out.println(average);
        }
    }
}
