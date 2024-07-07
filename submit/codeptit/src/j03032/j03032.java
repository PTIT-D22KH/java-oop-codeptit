package j03032;
import java.util.*;
public class j03032 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here 
        int t = Integer.parseInt(input.nextLine());
        while (t-- > 0) {
            testCase();
            System.out.println();
        }
    }
    public static void testCase (){
        String s = input.nextLine().trim();
        List<String> a = Arrays.asList(s.trim().split("\\s+"));
        for (int i =0 ; i < a.size(); i++) {
            StringBuilder tmp = new StringBuilder(a.get(i));
            System.out.printf("%s ", tmp.reverse().toString());
            
        }
    }
}
