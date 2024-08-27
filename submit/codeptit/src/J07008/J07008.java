package J07008;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class J07008 {
    private static int n;
    private static int a[];
    private static ArrayList<String> res = new ArrayList<>();
    private static ArrayList<Integer> num = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // Write your code here
        Scanner input = new Scanner(new File("J07008/DAYSO.in"));
        // Scanner input = new Scanner(new File("DAYSO.in"));
        n = input.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        Try(0);
        Collections.sort(res);
        for(String s : res) {
            System.out.println(s);
        }
        input.close();
    }
    public static void Try(int i) {
        if (num.size() > 1) {
            String s = "";
            for (int j : num) {
                s += j + " ";
            }
            res.add(s);
        }
        for (int j = i; j < n; j++) {
            if (num.isEmpty() || a[j] > num.get(num.size() - 1)) {
                num.add(a[j]);
                Try(j + 1);
                num.remove(num.size() - 1);
            }
        }
    }
}
