package j06002;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j06002 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        while (n-- > 0) {
            String id = input.nextLine();
            Product.getProductMap().put(id, new Product(id, input.nextLine(), Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine())));
        }

        n = Integer.parseInt(input.nextLine());
        ArrayList<Bill> bills = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String s = input.nextLine();
            String a[] = s.split(" ");
            bills.add(new Bill(a[0], Double.parseDouble(a[1])));
        }
        Collections.sort(bills, new CompareByFinalPrice());
        for (Bill x : bills) {
            System.out.println(x);
        }
        input.close();
    }
}
