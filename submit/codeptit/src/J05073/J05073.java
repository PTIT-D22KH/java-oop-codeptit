package J05073;

import java.util.ArrayList;
import java.util.Scanner;

public class J05073 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Bill> bills = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            bills.add(new Bill(input.nextLine()));
        }
        for (Bill bill : bills) {
            System.out.println(bill);
        }
        input.close();
    }
}