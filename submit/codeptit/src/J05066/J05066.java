package J05066;

import java.util.*;

public class J05066 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine().trim());
        ArrayList<Employee> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(new Employee(input.nextLine().trim()));
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