package j01025;

import java.util.Scanner;

public class j01025 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int maxA = 0, minA = 1001, maxB = 0, minB = 1001;
        for (int i = 0; i < 4; i++) {
            int a  = input.nextInt();
            int b = input.nextInt();
            if (a > maxA) {
                maxA = a;
            }
            if (b > maxB) {
                maxB = b;
            }
            if (a < minA) {
                minA = a;
            } 
            if (b < minB) {
                minB = b;
            }
        }
        int height = maxA - minA ;
        int width = maxB - minB;
        int res = Math.max(height, width);
        System.out.println(res * res);

    }
}
