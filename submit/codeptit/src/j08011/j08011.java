package j08011;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class j08011 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);

        Map<String, Integer> mp = new TreeMap<>();
        ArrayList<Number> a = new ArrayList<>();
        while (input.hasNextLine()) {
            String s = input.nextLine().trim();
            String x[] = s.split("\\s+");
            for (int i = 0; i < x.length; i++) {
                if (check(x[i])) {
                    if (mp.containsKey(x[i])) {
                        mp.put(x[i], mp.get(x[i]) + 1);
                    } else {
                        mp.put(x[i], 1);
                    }
                }
            }
        }
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            Number x = new Number(entry.getKey(), entry.getValue());
            a.add(x);
            // System.out.println(x);
        }
        Collections.sort(a, new CompareByFreDescIdAsc());
        for (Number x : a) {
            System.out.println(x);
        }

        input.close();
    }
    public static boolean check(String s) {
        if (s.length() > 9) {
            return false;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (Character.valueOf(s.charAt(i)) > Character.valueOf(s.charAt(i + 1))) {
                return false;
            }
        }
        return true;

    }
}
