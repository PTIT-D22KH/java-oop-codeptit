package j05056;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05056 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Athlete> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Athlete(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(a, new CompareByFinalTime());
        int rank = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || !a.get(i).getFinalTime().toString().equals(a.get(i - 1).getFinalTime().toString())) {
                rank = i + 1;
            }
            // System.out.println(a.get(i));
            // System.out.println(rank);
            a.get(i).setRank(rank);
            // System.out.println(a.get(i));
        }
        Collections.sort(a, new CompareByRank());
        for (Athlete x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
