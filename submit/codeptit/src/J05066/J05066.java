package J05066;

import java.util.*;

public class J05066 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            employees.add(new Employee(input.nextLine()));
        }
        Collections.sort(employees, new CompareByCoefficientAndStt());

        int q = Integer.parseInt(input.nextLine());
        for (int i = 0; i < q; i++) {
            String keyword = input.nextLine().toLowerCase();
            boolean found = false;
            for (Employee emp : employees) {
                if (emp.getName().toLowerCase().contains(keyword)) {
                    System.out.println(emp);
                    found = true;
                }
            }
            if (found) {
                System.out.println();
            }
        }
        input.close();
    }
}