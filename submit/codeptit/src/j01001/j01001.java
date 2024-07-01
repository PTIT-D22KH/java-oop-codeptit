package j01001;
import java.util.*;
public class j01001 {
    public static void main(String[] args) {
        // Write your code here
        testCase();
    }
    public static void testCase() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        Rectangle r = new Rectangle(a, b);
        System.out.printf("%d %d", r.getParameter(), r.getArea());
        input.close();
    }
}
