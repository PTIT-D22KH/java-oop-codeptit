package j03027;
import java.util.*;
public class j03027 {
    
    public static void main(String[] args) {

        // Write your code here
        Scanner input = new Scanner(System.in);
        Stack<Character> st = new Stack<Character>();
        String s = input.nextLine();
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            if (!st.empty() && st.peek() == (char)s.charAt(i)) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        if (st.size() == 0) {
            System.out.println("Empty String");
        } else {
            while (!st.empty()) {
                System.out.printf("%s", st.pop());
                
            }
        }
        input.close();
    }
}
