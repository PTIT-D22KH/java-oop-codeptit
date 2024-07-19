package j05007;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class j05007 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Employee> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String name, gender, dob, address, taxId, contractDate;
            name = input.nextLine().trim();
            gender = input.nextLine().trim(); 
            dob = input.nextLine().trim();
            address = input.nextLine().trim();
            taxId = input.nextLine().trim();
            contractDate = input.nextLine().trim();
            a.add(new Employee(name, gender, dob, address, taxId, contractDate));
        }
        Collections.sort(a, Employee.BY_AGE_DESC);
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
        input.close();
    }
}
