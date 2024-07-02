package j02007;

import java.util.*;

public class j02007 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            TestCase test = new TestCase();
            test.testCase();
            int[]fre = new int[10001];
            int []visited = new int[10001];
            for (int i = 0; i < 10001; i++) {
                fre[i] = 0;
                visited[i] = 0;
            }
            int m = input.nextInt();
            int []a = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = input.nextInt();
                fre[a[i]]++;
                visited[a[i]] = 1;
            }
            
            for (int i = 0; i < m; i++) {
                if (visited[a[i]] == 1) {
                    System.out.printf("%d xuat hien %d lan\n", a[i], fre[a[i]]);
                    visited[a[i]] = 0;
                }
                
            }
        }
    }
}
