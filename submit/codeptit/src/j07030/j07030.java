package j07030;
import java.util.*;
import java.io.*;
public class j07030 {
    public static final int k = 1000000;
    @SuppressWarnings({ "unchecked", "resource", "rawtypes" })
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        // Write your code here
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA1.in"));
        Set<Integer> list1 = new TreeSet<>((ArrayList)input.readObject());
        input = new ObjectInputStream(new FileInputStream("DATA2.in"));
        Set<Integer> list2 = new TreeSet<>((ArrayList)input.readObject());
        for (Integer x : list1) {
            if (x < k - x && isPrime(x) && list2.contains(k - x) && isPrime(k - x)) {
                System.out.printf("%d %d\n", x, k - x);
            }
        }
        input.close();

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
