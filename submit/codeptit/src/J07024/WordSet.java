package J07024;

import java.util.*;
import java.io.*;

public class WordSet {
    private Set<String> se = new TreeSet<>();
    private Scanner input;

    public WordSet(String fileName) throws IOException{
        input = new Scanner(new File(fileName));
        while(input.hasNextLine()) {
            String s = input.nextLine().trim().toLowerCase();
            String a[] = s.split("\\s+");
            for (String x : a) {
                se.add(x);
            }

        }
    }
    public WordSet() {

    }
    public WordSet difference(WordSet other) {
        WordSet res = new WordSet();
        for (String x : se) {
            if (!other.se.contains(x)) {
                res.se.add(x);
            }
        }
        return res;
    }

    @Override
    public String toString(){ 
        StringBuilder res = new StringBuilder();
        for (String x : se) {
            res.append(x).append(" ");
        }
        return res.toString().trim();
    }
}
