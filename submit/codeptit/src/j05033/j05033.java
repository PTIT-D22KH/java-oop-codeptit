package j05033;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05033 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Time> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Time(input.nextInt(), input.nextInt(), input.nextInt()));
        }
        Collections.sort(a, new CompareByTime());
        for (Time x : a) {
            System.out.println(x);
        }
        input.close();

    }
}
