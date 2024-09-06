package J05077;
import java.util.*;
public class J05077 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i< n; i++) {
            Department temp = new Department(input.nextLine());
        }
        int m = Integer.parseInt(input.nextLine());
        ArrayList<Employee> a = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            a.add(new Employee(input.nextLine(), input.nextLine(), Long.parseLong(input.nextLine()), Long.parseLong(input.nextLine())));
        }
        for (Employee x : a) {
            System.out.println(x);
        }
    }
}
