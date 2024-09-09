package j07020;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class j07020 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("KH.in"));
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            Customer a = new Customer(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());
        }
        input.close();

        input = new Scanner(new File("MH.in"));
        n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            Product a = new Product(input.nextLine(), input.nextLine(), Long.parseLong(input.nextLine()), Long.parseLong(input.nextLine()));
        }
        input.close();

        input = new Scanner(new File("HD.in"));
        n = Integer.parseInt(input.nextLine());
        ArrayList<Bill> bills = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String s = input.nextLine();
            String[] temp = s.split(" ");
            bills.add(new Bill(temp[0], temp[1], Integer.parseInt(temp[2])));
        }
        for (Bill x : bills) {
            System.out.println(x);
        }
        input.close();
    }
}