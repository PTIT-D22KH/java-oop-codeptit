package j07032;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class j07032 {

    public static boolean check(int n) {
        int x = n;
        int reversed = 0;
        int count = 0;
        while(n > 0) {
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
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException{
        // Write your code here
        ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream input2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> a1 = (ArrayList<Integer>)input1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>)input2.readObject();

        TreeSet<Integer> ts = new TreeSet<>();
        for (Integer x : a1) {
            if (a2.contains(x) && check(x)) {
                ts.add(x);
            }
            if (ts.size() >= 10) {
                break;
            }
        }
        Map<Integer, Integer> mp = new HashMap<>();
        for (Integer x : a1) {
            if (ts.contains(x)) {
                if (mp.containsKey(x)) {
                    mp.put(x, mp.get(x) + 1);
                } else {
                    mp.put(x, 1);
                }
            }
        }
        for (Integer x : a2) {
            if (ts.contains(x)) {
                if (mp.containsKey(x)) {
                    mp.put(x, mp.get(x) + 1);
                } else {
                    mp.put(x, 1);
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        input1.close();
        input2.close();
    }   
}
