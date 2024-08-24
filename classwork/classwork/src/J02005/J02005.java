package J02005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J02005 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
            aSet.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            b[i] = input.nextInt();
            bSet.add(b[i]);
        }
        Set<Integer> intersection = new HashSet<>(aSet);

        intersection.retainAll(bSet);
        ArrayList<Integer> res = new ArrayList<>(intersection);
        Collections.sort(res);
        for (int x : res) {
            System.out.printf("%d ", x);
        }
        input.close();
    }
}
