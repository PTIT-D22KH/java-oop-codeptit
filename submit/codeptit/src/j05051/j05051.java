package j05051;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05051 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n =Integer.parseInt(input.nextLine());
        ArrayList<Customer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Customer(input.nextLine(), Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine())));
        }
        Collections.sort(a, new CompareByTotalCost());
        for (Customer x : a) {
            System.out.println(x);
        }
        input.close();
    }
}

