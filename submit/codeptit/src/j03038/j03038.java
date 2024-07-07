package j03038;
import java.util.*;
public class j03038 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int []fre = new int[130];
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (fre[s.charAt(i)] == 0) {
                fre[s.charAt(i)] = 1;
                res++;
            }
        }
        System.out.println(res);
    }
}
