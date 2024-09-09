package J05076;

import java.util.*;

public class J05076 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            products.add(new Product(input.nextLine(), input.nextLine(), input.nextLine()));
        }

        int m = Integer.parseInt(input.nextLine());
        ArrayList<Bill> bills = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String s = input.nextLine();
            String[] b = s.trim().split("\\s+");
            String id = b[0];
            long numImport = Long.parseLong(b[1]);
            long singlePrice = Long.parseLong(b[2]);
            long numExport = Long.parseLong(b[3]);
            for (Product product : products) {
                if (product.getId().equals(id)) {
                    bills.add(new Bill(product, id, numImport, singlePrice, numExport));
                    break;
                }
            }
        }

        for (Bill bill : bills) {
            System.out.println(bill);
        }

        input.close();
    }
}