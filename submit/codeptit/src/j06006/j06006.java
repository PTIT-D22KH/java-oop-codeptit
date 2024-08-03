package j06006;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j06006 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        // ArrayList<Customer> customers = new ArrayList<>(n);

        for (int i = 0; i < n; i++ ){
            Customer a = new Customer(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());
        }
        n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++ ){
            Product a = new Product(input.nextLine(), input.nextLine(), Long.parseLong(input.nextLine()), Long.parseLong(input.nextLine()));
        }
        n = Integer.parseInt(input.nextLine());
        ArrayList<Bill> bills = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String s = input.nextLine();
            String temp[] = s.split(" ");
            bills.add(new Bill(temp[0], temp[1], Integer.parseInt(temp[2])));
        }
        Collections.sort(bills, new CompareByTotalProfit());
        for (Bill x : bills) {
            System.out.println(x);
        }
        input.close();
    }
}
