package J05065;
import java.util.*;
public class J05065 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Employee> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(new Employee(input.nextLine()));
        }
        Collections.sort(a, new CompareByCoefficientAndStt());
        int q = Integer.parseInt(input.nextLine());
        for (int i = 0; i < q; i++) {

            String role = input.nextLine();
            for (Employee x : a) {
                if (x.getRole().equals(role)) {
                    System.out.println(x);
                }
            }
            System.out.println();
        }
    }
}
