package JKT015;
import java.util.*;
public class JKT015 {
    // public static void main(String[] args) {
    //     // Write your code here
    //     Scanner input = new Scanner(System.in);
    //     String s = input.nextLine();
    //     int j = 0;
    //     StringBuilder res = new StringBuilder();
    //     for (int i = 0; i < s.length(); i++) {
    //         if ((s.charAt(i) == '<') ) {
    //             if (j > 0) {
    //                 j--;
    //             }
                
    //         } else if (s.charAt(i) == '>') {
    //             if (j < res.length()) {
    //                 j++;
    //             }
                
    //         }  else if (s.charAt(i) == '-' ) {
    //             if (j > 0) {
    //                 res.deleteCharAt(j - 1);
    //                 j--;
    //             }
    //         }
    //         else {
    //             res.insert(j, s.charAt(i));
    //             j++;
    //         }
    //         // System.out.println(res.toString());

    //     }
    //     System.out.println(res.toString());
    //     input.close();
    // }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        input.close();
        LinkedList<Character> res = new LinkedList<>();
        ListIterator<Character> it = res.listIterator();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '<') {
                if (it.hasPrevious()) {
                    it.previous();
                }
            } else if (c == '>') {
                if (it.hasNext()) {
                    it.next();
                }
            } else if (c == '-') {
                if (it.hasPrevious()) {
                    it.previous();
                    it.remove();
                }
            } else {
                it.add(c);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : res) {
            result.append(c);
        }
        System.out.println(result.toString());
    }
}
