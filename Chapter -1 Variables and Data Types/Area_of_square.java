import java.util.Scanner;

public class Area_of_square {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // input side of square
            int side = sc.nextInt();
            float area = side * side;
            // print area
            System.out.println(area);
        }
    }
}
