package j05050;

import java.util.ArrayList;
import java.util.Scanner;

public class j05050 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n =Integer.parseInt(input.nextLine());
        ArrayList<Customer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Customer(input.nextLine(), Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine())));
        }
        for (Customer x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
