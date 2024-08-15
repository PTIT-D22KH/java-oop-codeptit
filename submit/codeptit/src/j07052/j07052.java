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
        int m = Integer.parseInt(input.nextLine());
        System.out.println(String.format("%.1f", a.get(m - 1).getTotalScore()));
        for (Contestant x : a) {
            System.out.println(x);
        }
        input.close();
    }
}