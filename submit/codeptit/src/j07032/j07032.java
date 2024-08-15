package j07032;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class j07032 {

    public static boolean check(int n) {
        int x = n;
        int reversed = 0;
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                return false;
            }
            count++;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        if (count % 2 == 0 || count < 3) {
            return false;
        }
        return (reversed == x);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {
        ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream input2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> a1 = (ArrayList<Integer>) input1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) input2.readObject();

        HashSet<Integer> set1 = new HashSet<>(a1);
        HashSet<Integer> set2 = new HashSet<>(a2);
        TreeSet<Integer> ts = new TreeSet<>();
        int[] countArray = new int[1000003];

        for (Integer x : set1) {
            if (set2.contains(x) && check(x)) {
                ts.add(x);
            }
            if (ts.size() >= 10) {
                break;
            }
        }

        for (Integer x : a1) {
            if (ts.contains(x)) {
                countArray[x]++;
            }
        }
        for (Integer x : a2) {
            if (ts.contains(x)) {
                countArray[x]++;
            }
        }

        for (Integer x : ts) {
            System.out.println(x + " " + countArray[x]);
        }

        input1.close();
        input2.close();
    }
}