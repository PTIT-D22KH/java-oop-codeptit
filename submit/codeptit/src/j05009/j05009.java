package j05009;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class j05009 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Contestant> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String name, dob;
            double m1, m2,m3;
            name = input.nextLine();
            dob = input.nextLine();
            m1 = Double.parseDouble(input.nextLine());
            m2 = Double.parseDouble(input.nextLine());
            m3 = Double.parseDouble(input.nextLine());
            a.add(new Contestant(name, dob, m1, m2, m3));
        }
        Collections.sort(a, Contestant.BY_TOTAL_SCORE_DESC_ID_ASC);
        for (Contestant x : a) {
            if (x.getTotalScore() == a.get(0).getTotalScore()) {
                System.out.println(x);
            } else {
                break;
            }
        }
        input.close();
    }
}
