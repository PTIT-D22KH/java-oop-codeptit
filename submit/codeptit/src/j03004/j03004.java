package j03004;
import java.util.*;
public class j03004 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        int t = Integer.parseInt(input.nextLine());
        while (t-- > 0) {
            testCase();
            System.out.println();
        }
    }
    public static void testCase() {
        String s = input.nextLine();
        String []w = s.toLowerCase().split(" ");

        for (int i = 0; i < w.length; i++) {
            if (w[i].length() != 0) {
                String word = w[i];
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
                System.out.print(word);
            }
        }
    }
}
