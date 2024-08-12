package j01001;
import java.util.*;
public class j01001 {
    public static void main(String[] args) {
        // Write your code here
        testCase();
    }
    public static void testCase() {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long b = input.nextLong();
        if (a <= 0 || b <= 0) {
            System.out.println("0");
            return;
        } else {
            Rectangle r = new Rectangle(a, b);
            System.out.println(r.getParameter() + " " +  r.getArea());
        }
        
        
        input.close();
    }
}
