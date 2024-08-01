package j05028;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05028 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Enterprise> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Enterprise(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine())));
        }
        Collections.sort(a, new CompareByCapacity());
        for (Enterprise s : a) {
            System.out.println(s);
        }
        input.close();
    }
}
