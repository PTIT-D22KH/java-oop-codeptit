package J05013;

import java.util.*;
public class J05013 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Contestant> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Contestant(input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(a, new CompareByAvgScore());
        for (Contestant x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
