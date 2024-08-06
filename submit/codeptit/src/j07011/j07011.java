package j07011;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.File;

public class j07011 {
    public static void main(String[] args) throws FileNotFoundException{
        // Write your code here
        // Scanner input = new Scanner(new File("j07011/VANBAN.in"));
        Scanner input = new Scanner(new File("VANBAN.in"));
        int n = Integer.parseInt(input.nextLine());
        Map<String, Integer> mp = new TreeMap<>();
        for (int i = 0; i < n; i++ ){
            String s = input.nextLine();
            String a[] = s.split("[,\\.?\\!:\\;\\(-\\/\\s]");
            for (int j = 0; j < a.length; j++) {
                String temp = a[j].toLowerCase();
                // System.out.println(temp);
                if (mp.containsKey(temp)) {
                    int count = mp.get(temp);
                    mp.replace(temp, ++count);
                } else {
                    mp.put(temp, 1);
                }
            }
        }
        ArrayList<Word> words = new ArrayList<>();
        for(String x : mp.keySet()) {
            words.add(new Word(x, mp.get(x)));
        }
        Collections.sort(words, new CompareByFre());
        for (Word x : words) {
            System.out.println(x);
        }
        

        input.close();
    }
}
