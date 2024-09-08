package J05063;

import java.util.*;

public class J05063 {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            // System.out.println(p);
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}
