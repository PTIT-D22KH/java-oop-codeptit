package j01003;
import java.util.*;
public class j01003 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        testCase();
    }
    public static void testCase() {
        int a = input.nextInt();
        int b = input.nextInt();
        LinearEquation l = new LinearEquation(a, b);
        l.solveEquation();
    }
}
