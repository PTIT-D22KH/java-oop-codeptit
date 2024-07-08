package j07031;
import java.util.*;
import java.io.*;
public class j07031 {
    public static final int k = 1000000;
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        // Write your code here
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a = (ArrayList<Integer>)input.readObject();
        input = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> b = (ArrayList<Integer>)input.readObject();
        Set<Integer> set1 = new TreeSet<>(a);
        Set<Integer> set2 = new TreeSet<>(b);
        for (int x : a) {
            if (x < k - x && !set2.contains(x) && !set2.contains(k - x) && isPrime(x) && isPrime(k - x) && set1.contains(k - x)) {
                System.out.printf("%d %d\n", x, k - x);
            }
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
