package j07059;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j07059 {
    public static void main(String[] args) throws IOException {
        // Write your code here
        Scanner input = new Scanner(new File("j07059/CATHI.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<TestTime> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new TestTime(input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(a, new CompareByTimeAscIdAsc());
        for (TestTime x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
