package J05052;
import java.util.*;

public class J05052 {
    public static void main(String[] args) {
        // Write your code heres
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Bill> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Bill(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine())));
        }
        for (Bill x : a) {
            System.out.println(x);
        }


        input.close();
    }
}
