import java.util.Scanner;

public class Add_products_cost_with_gst {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // cost of three items (pen,pencil,paper)
            float pen, pencil, paper;
            pen = sc.nextFloat();
            pencil = sc.nextFloat();
            paper = sc.nextFloat();
            // add all items with 18% GST
            float total = pen + pencil + paper;
            float totalWithGST = total + (total * 18 / 100);
            // print cost
            System.out.println(total); // price without gst
            System.out.println(totalWithGST); // price with gst
        }
    }
}
