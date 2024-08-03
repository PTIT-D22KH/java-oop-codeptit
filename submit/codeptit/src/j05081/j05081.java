package j05081;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05081 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Product> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Product(input.nextLine(), input.nextLine(), Long.parseLong(input.nextLine()), Long.parseLong(input.nextLine())));
        }
        Collections.sort(a, new CompareByProfitAndId());
        for (Product x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
