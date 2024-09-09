package J05012;

import java.util.*;

public class J05012 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Bill> bills = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = input.nextLine();
            String name = input.nextLine();
            Long numBuy = Long.parseLong(input.nextLine());
            Long singlePrice = Long.parseLong(input.nextLine());
            Long discount = Long.parseLong(input.nextLine());
            bills.add(new Bill(id, name, singlePrice, numBuy, discount));
        }
        Collections.sort(bills, new CompareByTotalCost());
        for (Bill x : bills) {
            System.out.println(x);
        }

        input.close();
    }
}
