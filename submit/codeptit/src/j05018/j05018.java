package j05018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05018 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Student(input.nextLine(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble()));
            // System.out.println(a.get(i));
            if (i != n - 1) {
                input.nextLine();
                // String s = input.nextLine();
                // System.out.println(s);
            }
            
        }
        Collections.sort(a, new CompareByAvgScoreAndId());
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
        input.close();
    }
}
