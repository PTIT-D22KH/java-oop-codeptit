package j07052;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j07052 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Contestant> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Contestant(input.nextLine(), input.nextLine(), Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine())));
        }
        Collections.sort(a, new CompareByTotalScoreDesc());
        int numPass = Integer.parseInt(input.nextLine());
        double lowestPoint = a.get(numPass - 1).getTotalScore();
        for (int i = numPass; i < a.size(); i++) {
            if (a.get(i).getTotalScore() == lowestPoint) {
                numPass++;
            } else {
                break;
            }
        }
        System.out.println(String.format("%.1f", lowestPoint));
        for (int i = 0; i < a.size(); i++) {
            if (i < numPass) {
                System.out.println(a.get(i) + " " + "TRUNG TUYEN");
            } else {
                System.out.println(a.get(i) + " " + "TRUOT");
            }
        }
        input.close();
    }
}