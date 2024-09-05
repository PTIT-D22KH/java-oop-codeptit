package J05061;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J05061 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        List<Contestant> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Contestant(input.nextLine(), input.nextLine(), Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine())));
        }
        Collections.sort(a, new CompareByTotalScoreAndId());
        for (Contestant x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
