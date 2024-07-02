package j02005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class j02005 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        testCase();

    }
    public static void testCase() {
        int n = input.nextInt();
        int m = input.nextInt();
        int []a = new int[n];
        int []b = new int[m];
        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();
        for (int i = 0; i < n; i++ ){
            a[i] = input.nextInt();
            aSet.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            b[i] = input.nextInt();
            bSet.add(b[i]);
        }
        Set<Integer> intersection = new HashSet<>(aSet);
        intersection.retainAll(bSet);
        List<Integer> resList = new ArrayList<>(intersection);
        Collections.sort(resList);
        for (int x : resList) {
            System.out.printf("%d ", x);
        }


    }
}
