package j05048;

import java.util.ArrayList;
import java.util.Scanner;

public class j05048 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        ArrayList<Product> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++){ 
            a.add(new Product(input.nextLine(), Double.parseDouble(input.nextLine())));
        }
        for (Product x : a) {
            System.out.println(x);
        }

        input.close();
    }
}
