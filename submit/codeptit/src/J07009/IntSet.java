package J07009;

import java.util.Set;
import java.util.TreeSet;

public class IntSet {
    private Set<Integer> se = new TreeSet<>();
    public IntSet() {

    }
    public IntSet(int a[]) {
        for (int i = 0; i < a.length; i++) {
            this.se.add(a[i]);
        }
    }
    public IntSet intersection(IntSet other) {
        IntSet res = new IntSet();
        Set<Integer> newSet = new TreeSet<>();
        newSet.addAll(this.se);
        newSet.retainAll(other.se);
        res.se = newSet;
        return res;
    }

    @Override
    public String toString() {
        StringBuilder res=  new StringBuilder();
        for(int x : se) {
            res.append(x).append(" ");
        }
        return res.toString().trim();
    }
}
