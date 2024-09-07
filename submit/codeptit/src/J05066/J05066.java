package J05066;

import java.util.*;

public class J05066 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine().trim());
        ArrayList<Employee> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String id = input.next().trim();
            String name = input.nextLine().trim();
            Employee emp = new Employee(id, name);
            if (emp.getRole().equals("TP") && emp.getStt() > 3) {
                emp.setId("NV" + id.substring(2));
            } else if (emp.getRole().equals("PP") && emp.getStt() > 3) {
                emp.setId("NV" + id.substring(2));
            } else if (emp.getRole().equals("GD") && emp.getStt() > 1) {
                emp.setId("NV" + id.substring(2));
            }
            a.add(emp);
        }

        Collections.sort(a, new CompareByCoefficientAndStt());

        int q = Integer.parseInt(input.nextLine().trim());
        for (int i = 0; i < q; i++) {
            String name = input.nextLine().trim().toLowerCase();
            for (Employee x : a) {
                if (x.getName().toLowerCase().contains(name)) {
                    System.out.println(x);
                }
            }
            System.out.println();
        }
        input.close();
    }
}