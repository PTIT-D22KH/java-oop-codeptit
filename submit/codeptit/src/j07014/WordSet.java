package j07014;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.File;
import java.io.FileNotFoundException;


public class WordSet {
    private Set<String> se = new TreeSet<>();

    public WordSet() {

    }
    public WordSet(String fileName) throws FileNotFoundException {
        String fullFileName = "j07014/" + fileName; 
        Scanner input = new Scanner(new File(fullFileName));
        while (input.hasNextLine()) {
            String s = input.nextLine();
            addToWordSet(s);
        }
        input.close();
    }
    // public WordSet(String s) {
    //     addToWordSet(s);
    // }

    public void addToWordSet(String s) {
        String a[] = s.split("\\s+");
        for (String x : a) {
            se.add(x.toLowerCase());
        }
    }
    public WordSet union(WordSet other) {
        WordSet res = new WordSet();
        for (String s : se) {
            for (String x : other.se) {
                res.se.add(x);
                res.se.add(s);
            }
        }
        return res;
    }
    public WordSet intersection(WordSet other) {
        // System.out.println(this);
        // System.out.println(other);
        WordSet res = new WordSet();
        // res.se.addAll(this.se);
        
        for (String s : this.se) {
            if (other.se.contains(s) == true) {
                res.addToWordSet(s);
            }
        }
        return res;

    }
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (String x : se) {
            res.append(x);
            res.append(" ");
        }
        return res.toString().trim();
    }
}
