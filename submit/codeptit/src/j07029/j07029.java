package j07029;
import java.util.*;
import java.io.*;
public class j07029 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args)throws IOException, FileNotFoundException, ClassNotFoundException {
        // Write your code here
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));

        ArrayList<Integer> a = (ArrayList<Integer>)input.readObject();
        ArrayList<Integer> res = new ArrayList<>();
        int fre[] = new int[1000005];
        for (int i : a) {
            if (isPrime(i)) {
                if (fre[i] == 0) {
                    res.add(i);
                }
                fre[i]++;
            }
        }
        Collections.sort(res, Collections.reverseOrder());
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d %d\n", res.get(i), fre[res.get(i)]);
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
