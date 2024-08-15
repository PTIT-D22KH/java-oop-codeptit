package j07031;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class j07031 {
    public static final int k = 1000000;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream input2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) input1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) input2.readObject();
        TreeSet<Integer> set1 = new TreeSet<>(arr1);
        TreeSet<Integer> set2 = new TreeSet<>(arr2);
        ArrayList<Integer> result = new ArrayList<>();

        for (int x : set1) {
            if (x < 500000 && !set2.contains(x) && !set2.contains(k - x) && isPrime(x) && isPrime(k - x) && set1.contains(k - x)) {
                result.add(x);
            }
        }

        for (int x : result) {
            System.out.printf("%d %d\n", x, k - x);
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}