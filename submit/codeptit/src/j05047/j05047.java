package j05047;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05047 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Load> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Load(input.nextLine(), Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine())));
        }
        Collections.sort(a, new CompareByDiscount());
        
        for (Load x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
