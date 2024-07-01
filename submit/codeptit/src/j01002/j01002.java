package j01002;
import java.util.*;
public class j01002 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            Test test = new Test();
            System.out.println(test.testCase());
        }
    }
}
