package j04022;

import java.util.Set;
import java.util.TreeSet;

public class WordSet {
    private Set<String> st = new TreeSet<>();
    public WordSet() {

    }
    public WordSet(String s) {
        String []a = s.toLowerCase().split("\\s+");
        for (String x : a) {
            st.add(x);
        }
    }
    public WordSet union(WordSet other) {
        WordSet res = new WordSet();
        for (String s : this.st) {
            res.st.add(s);
        }
        for (String s: other.st) {
            res.st.add(s);
        }
        return res;
    }
    public WordSet intersection(WordSet other) {
        WordSet res = new WordSet();
        for (String s : this.st) {
            if (other.st.contains(s) == true) {
                res.st.add(s);
            }
        } 
        return res;
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("");
        for (String x : st) {
            s.append(x).append(" ");
        }
        return s.toString().trim();
    }
}
