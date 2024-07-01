package j01002;
import java.util.*;
public class Test {
    public static Scanner input = new Scanner(System.in);
    public long testCase() {
        int n = input.nextInt();
        long res = n * (n + 1) / 2;
        return res;
    }

}
