package j08011;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class j08011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String, Integer> mp = new TreeMap<>();
        ArrayList<Number> numbers = new ArrayList<>();
        while (input.hasNextLine()) {
            String s = input.nextLine().trim();
            String[] x = s.split("\\s+");
            for (String value : x) {
                if (check(value)) {
                    mp.put(value, mp.getOrDefault(value, 0) + 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            Number number = new Number(entry.getKey(), entry.getValue());
            numbers.add(number);
        }
        Collections.sort(numbers, new CompareByFreDescIdAsc());
        for (Number number : numbers) {
            System.out.println(number);
        }

        input.close();
    }

    public static boolean check(String s) {
        if (s.length() > 9) {
            return false;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}