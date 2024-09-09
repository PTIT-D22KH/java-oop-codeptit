package J04021;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class IntSet {
    private Set<Integer> se = new HashSet<>();
    public IntSet(int a[]) {
        for (int x : a) {
            se.add(x);
        }
    }
    public IntSet(Set<Integer> se) {
        this.se.addAll(se);
    }
    public IntSet union(IntSet other) {
        Set<Integer> res = new HashSet<>();
        res.addAll(se);
        res.addAll(other.se);
        return new IntSet(res);
    }
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Set<Integer> sortedSet = new TreeSet<>(se);
        for (int x : sortedSet) {
            res.append(x).append(" ");
        }
        return res.toString().trim();
    }
}
