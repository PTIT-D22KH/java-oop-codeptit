package j05013;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05013 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        ArrayList<Candidate> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++ ){
            String name;
            double ltScore, thScore;
            name = input.nextLine();
            ltScore = Double.parseDouble(input.nextLine());
            thScore = Double.parseDouble(input.nextLine());
            a.add(new Candidate(name, ltScore, thScore));
        }
        Collections.sort(a, new CompareByAverageScore());
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }

        
    }
}
