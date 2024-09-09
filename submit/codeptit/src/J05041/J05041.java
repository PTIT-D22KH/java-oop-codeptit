package J05041;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05041 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Employee> a = new ArrayList<>();
        for (int i = 0; i < n; i++ ){
            a.add(new Employee(input.nextLine(), Long.parseLong(input.nextLine()), Long.parseLong(input.nextLine()), input.nextLine()));
        }
        Collections.sort(a, new CompareByTotalSal());
        for (Employee x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
