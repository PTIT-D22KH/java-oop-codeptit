package J02037;
import java.util.*;
public class J02037 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());
        while (t-- > 0) {
            String s = input.nextLine().trim();
            String a[] = s.split("\\s+");
            ArrayList<Integer> x = new ArrayList<>();
            for (String temp : a) {
                x.add(Integer.parseInt(temp));
            }
            int n = x.size();
            int countEven = 0;
            int countOdd = 0;
            for (int m : x)  {
                // System.out.println(m);
                if (m % 2 == 0) {
                    countEven ++;
                } else {
                    countOdd++;
                }
            }
            if (n % 2 == 0) {
                if (countEven > countOdd) {
                    System.out.println("YES");
                    
                } else {
                    System.out.println("NO");
                }
            } else {
                if (countOdd > countEven) {
                    System.out.println("YES");
                    
                } else {
                    System.out.println("NO");
                }
            }
            
        }

    }
}
