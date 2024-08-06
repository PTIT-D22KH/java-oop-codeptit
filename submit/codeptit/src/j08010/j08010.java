package j08010;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class j08010 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);

        Map<String, Integer> mp = new TreeMap<>();
        ArrayList<String> a = new ArrayList<>();
        int maxLength = 0;
        while(input.hasNextLine()) {
            String s = input.nextLine().trim();
            String x[] = s.split("\\s+");
            for (String temp : x) {
                if (isPalindrome(temp)) {
                    if (mp.containsKey(temp)) {
                        mp.put(temp, mp.get(temp) + 1);
                    } else {
                        mp.put(temp, 1);
                        a.add(temp);
                        maxLength = Math.max(maxLength, temp.length());
                    }
                    
                }
            }
        }
        for (String x : a) {
            if (x.length() == maxLength) {
                System.out.println(x + " " + mp.get(x));
            }
        }
        input.close();
    }

    public static boolean isPalindrome(String s) {
        
        StringBuilder a = new StringBuilder(s);
        String x = a.reverse().toString();
        return x.equals(s);
    }
}
