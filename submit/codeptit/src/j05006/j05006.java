package j05006;

import java.util.ArrayList;
import java.util.Scanner;

public class j05006 {
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
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
        input.close();
    }
}
