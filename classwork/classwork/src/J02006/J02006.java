package J02006;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J02006 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < n; i++) {
            res.add(input.nextInt());
        }
        for (int i = 0; i < m; i++) {
            res.add(input.nextInt());
        }
        ArrayList<Integer> a = new ArrayList<>(res);
        Collections.sort(a);
        for (int x : a) {
            System.out.printf("%d ", x);
        }
        input.close();

    }
}
