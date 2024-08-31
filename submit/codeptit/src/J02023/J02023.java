package J02023;

import java.util.Scanner;

public class J02023 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int s = input.nextInt();
        input.close();
        if ((s < 1) || s > 9 * n) {
            System.out.println("-1 -1");
            return;
        }
        if (s == 0 && n == 1) {
            System.out.println("0 0");
            return;
        } 
        int sum = s;
    
        StringBuilder largest = new StringBuilder();
        while (n > 0) {
            if (sum > 9) {
                largest.append("9");
                sum -= 9;
            } else {
                largest.append(String.valueOf(sum));
                sum = 0;
            }
            n--;
        }
        String smallest = largest.toString();
        StringBuilder smallestBuilder = new StringBuilder(smallest);
        smallestBuilder.reverse();
        if (smallest.charAt(0) == '0') {
            int i = 1;
            smallestBuilder.setCharAt(0, '1');
            while (smallest.charAt(0) == '0') {
                i++;
            }
            smallestBuilder.setCharAt(i, (char) (smallest.charAt(i) - 1));
        }
        System.out.println(smallestBuilder.toString() + " " + largest.toString());

    }
}
