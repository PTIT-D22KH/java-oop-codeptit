package J05053;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05053 {
    public static void main(String[] args) {
        // Write your code heres
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Bill> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Bill(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine())));
        }
        Collections.sort(a, new CompareByStt());
        for (Bill x : a) {
            System.out.println(x);
        }


        input.close();
    }
}
