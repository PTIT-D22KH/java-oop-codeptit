package dsa01001;

import java.util.*;

public class dsa01001 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int t = input.nextInt();
        while (t-- > 0) {
            Test test = new Test();
            System.out.println(test.testCase());
        }
    }

}