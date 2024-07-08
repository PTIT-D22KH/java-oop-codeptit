package j07015;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class j07015 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        // Write your code here
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        @SuppressWarnings("unchecked")
        ArrayList<Integer> a = (ArrayList<Integer>)input.readObject();
        int []fre = new int[10005];
        for (int x : a) {
            if (isPrime(x)) {
                fre[x]++;
            }
        }
        for (int i = 2; i <= 10000; i++) {
            if (fre[i] > 0) {
                System.out.printf("%d %d\n", i, fre[i]);
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
