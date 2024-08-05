package j07019;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class j07019 {
    public static void main(String[] args) throws IOException{
        // Write your code here
        Scanner input = new Scanner(new File("DATA1.in"));
        // Scanner input = new Scanner(new File("j07019/DATA1.in"));
        int n = Integer.parseInt(input.nextLine());
        while (n-- > 0) {
            String id = input.nextLine();
            Product.getProductMap().put(id, new Product(id, input.nextLine(), Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine())));
        }
        input.close();
        input = new Scanner(new File("DATA2.in"));
        // input = new Scanner(new File("j07019/DATA2.in"));
        n = Integer.parseInt(input.nextLine());
        ArrayList<Bill> bills = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String s = input.nextLine();
            String a[] = s.split(" ");
            bills.add(new Bill(a[0], Double.parseDouble(a[1])));
        }
        for (Bill x : bills) {
            System.out.println(x);
        }
        input.close();

    }
}
