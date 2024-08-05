package j07017;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import j04020.Pair;

public class j07017 {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(new File("DATA.in"));
        Scanner sc = new Scanner(new File("j07017/DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
        sc.close();
    }
}
