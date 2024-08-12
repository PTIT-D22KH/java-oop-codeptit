package j01014;

import java.util.Scanner;
public class j01014 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int t = input.nextInt();
        long n;
        while (t-- > 0) {
            n  = input.nextLong();
            System.out.println(maxPrime(n));
        }
        input.close();
    }
    public static long maxPrime(long n) {
        long res = -1;
        while (n % 2 == 0) {
            res = 2;
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2){
                
            while (n % i == 0) {
                n /= i;
                res = i;
            }
        }
        if (n > 2) {
            res = n;
        }
        return res;
    }
}
