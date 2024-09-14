package J05081;
import java.util.*;
public class J05081 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        ArrayList<Product> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Product(input.nextLine(), input.nextLine(), Long.parseLong(input.nextLine()), Long.parseLong(input.nextLine())));
        }
        Collections.sort(a);
        for (Product x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
