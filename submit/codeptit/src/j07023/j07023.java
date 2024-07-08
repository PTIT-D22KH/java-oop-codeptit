package j07023;
import java.util.*;
import java.io.*;
public class j07023 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        // Write your code here
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a = (ArrayList<Integer>)input.readObject();
        input = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> b=  (ArrayList<Integer>)input.readObject();
        input.close();
        int fre1[] = new int[10005];
        int fre2[] = new int[10005];
        for (int i : a) {
            if (isPrime(i) && isPalindrome(i)) {
                fre1[i]++;
            }
        }
        for (int i : b) {
            if (isPrime(i) && isPalindrome(i)) {
                fre2[i]++;
            }
        }
        for (int i = 2; i <= 10000; i++) {
            if (fre1[i] > 0 && fre2[i] > 0) {
                System.out.printf("%d %d %d\n", i, fre1[i], fre2[i]);
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
    public static boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}
