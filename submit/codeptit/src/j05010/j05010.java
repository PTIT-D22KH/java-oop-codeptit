package j05010;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class j05010 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Item> a = new ArrayList<>();
        for (int i = 0; i < n; i++ ){
            String name , group;
            double buyPrice, sellPrice;
            name = input.nextLine();
            group = input.nextLine();
            buyPrice = Double.parseDouble(input.nextLine());
            sellPrice = Double.parseDouble(input.nextLine());
            a.add(new Item(name, group, buyPrice, sellPrice));
        }
        Collections.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
        input.close();
    }
}
