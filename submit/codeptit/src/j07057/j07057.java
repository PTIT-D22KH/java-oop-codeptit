package j07057;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j07057 {
    public static void main(String[] args)throws IOException {
        // Write your code here
        // Scanner input = new Scanner(new File("j07057/THISINH.in"));
        Scanner input = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Contestant> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Contestant(input.nextLine(), Double.parseDouble(input.nextLine()), input.nextLine(), input.nextLine()));
        }
        Collections.sort(a, new CompareByTotalScoreDescIdAsc());
        for (Contestant x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
