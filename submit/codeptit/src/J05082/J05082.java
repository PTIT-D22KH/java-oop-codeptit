package J05082;
import java.util.*;
public class J05082 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        ArrayList<Customer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Customer(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(a, new CompareByAge());
        for (Customer x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
