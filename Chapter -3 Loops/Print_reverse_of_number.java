// note : we have to print only
public class Print_reverse_of_number {
    public static void main(String[] args) {
        int n = 108949;
        while (n != 0) {
            System.out.print(n % 10);
            n /= 10;
        }

    }
}
