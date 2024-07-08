package j07061;
import java.util.*;
import java.io.*;
public class j07061 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        // Write your code here
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> a = (List<Integer>)input.readObject();

        input = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> b = (List<Integer>)input.readObject();
        input.close();
        int fre1[] = new int[10001];
        int fre2[] = new int[10001];
        for (int x : a) {
            if (check(x)) {
                fre1[x]++;
            }
        }
        for (int x : a) {
            if (check(x)) {
                fre2[x]++;
            }
        }
        for (int i = 10; i < fre1.length; i++) {
            if (fre1[i] > 0 && fre2[i] > 0) {
                System.out.printf("%d %d %d", i, fre1[i], fre2[i]);
            }
        }
    }
    public static boolean check(int n) {
        String s = String.valueOf(n);
        for (int i = 1; i < s.length(); i++) {
            if (Character.valueOf(s.charAt(i)) < Character.valueOf(s.charAt(i - 1))) {
                return false;
            }
        }
        return true;
    }
}
