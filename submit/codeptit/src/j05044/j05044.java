package j05044;

import java.util.ArrayList;
import java.util.Scanner;

public class j05044 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Employee> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Employee(input.nextLine(), input.nextLine(), Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine())));
        }
        String role = input.nextLine();

        for (Employee x : a) {
            if (x.getRole().equals(role)) {
                System.out.println(x);
            }
            
        }
        input.close();
    }
}
