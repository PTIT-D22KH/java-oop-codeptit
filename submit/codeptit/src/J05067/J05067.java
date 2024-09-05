package J05067;
import java.util.*;
public class J05067 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Bill> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Bill(input.nextLine()));
        }
        for (Bill x : a) {
            System.out.println(x);
        }

        input.close();
    }
}
