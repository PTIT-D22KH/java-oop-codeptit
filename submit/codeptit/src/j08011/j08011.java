package j08011;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.*;
public class j08011 {
    public static boolean check(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Number> map = new HashMap<>();
        ArrayList<Number> a = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            if (!check(s)) continue;
            if (map.containsKey(s)) {
                map.get(s).incrementFrequency();
            } else {
                Number num = new Number(s, 1);
                map.put(s, num);
                a.add(num);
            }
        }
        Collections.sort(a, new CompareByFreDescIdAsc());
        for (Number x : a) System.out.println(x);
        sc.close();
    }
}