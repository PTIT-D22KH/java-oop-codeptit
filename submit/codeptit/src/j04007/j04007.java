package j04007;

import java.util.Scanner;

public class j04007 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input= new Scanner(System.in);

        String name, gender, dob, address, taxId, contractDate;
        name = input.nextLine().trim();
        gender = input.nextLine().trim();
        dob = input.nextLine().trim();
        address = input.nextLine().trim();
        taxId = input.nextLine().trim();
        contractDate = input.nextLine().trim();
        Employee a = new Employee(name, gender, dob, address, taxId, contractDate);
        System.out.println(a);
        
        input.close();
    }
}
