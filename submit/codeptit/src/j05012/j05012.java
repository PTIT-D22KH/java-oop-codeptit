package j05012;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05012 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Bill> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String id, name;
            long quantity, singlePrice, discount;
            id = input.nextLine();
            name = input.nextLine();
            quantity = Long.parseLong(input.nextLine());
            singlePrice = Long.parseLong(input.nextLine());
            discount = Long.parseLong(input.nextLine());
            a.add(new Bill(id, name, quantity, singlePrice, discount));
        }
        Collections.sort(a, new CompareByTotalPrice());
        for (int i = 0; i < n; i++ ){
            System.out.println(a.get(i));
        }

        input.close();
    }   
}
