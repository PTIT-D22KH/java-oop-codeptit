package j05049;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05049 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        ArrayList<Product> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++){ 
            a.add(new Product(input.nextLine(), Double.parseDouble(input.nextLine())));
        }
        Collections.sort(a, new CompareByTax());
        String group = input.nextLine();
        for (Product x : a) {
            if (String.valueOf(x.getId().charAt(0)).equals(group)) {
                System.out.println(x);
            }
        }

        input.close();
    }
}
