package j08012;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class j08012 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        Graph g = new Graph(n, n -1);
        for (int i = 0; i < n - 1; i++) {
            int u = input.nextInt();
            int v = input.nextInt();
            Set<Integer> s1 = g.getEdges().get(u);
            if (s1 == null) {
                s1 = new HashSet<>();
                s1.add(v);
                g.getEdges().put(u, s1);
            } else {
                g.getEdges().get(u).add(v);
            }
            Set<Integer> s2 = g.getEdges().get(v);
            if (s2 == null) {
                s2 = new HashSet<>();
                s2.add(u);
                g.getEdges().put(v, s2);
            } else {
                g.getEdges().get(v).add(u);
            }
        }   
        int count1 = 0, countOthers = 0;
        for (Map.Entry<Integer, Set<Integer>> entry : g.getEdges().entrySet()) {
            if (entry.getValue().size() == n - 1) {
                count1++;
            } else if (entry.getValue().size() == 1) {
                countOthers++;
            }

        }
        if (count1 == 1 && countOthers == n - 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        input.close();
    }
}
