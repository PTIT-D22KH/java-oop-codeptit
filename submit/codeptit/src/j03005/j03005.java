package j03005;
import java.util.*;
public class j03005 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Write your code here
        int t = Integer.parseInt(input.nextLine());
        while (t-- > 0) {
            testCase2();
        }
    }
    public static void testCase() {
        String s = input.nextLine();
        String []tmp = s.toLowerCase().split(" ");
        List<String> a = new ArrayList<>();
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i].length() != 0) {
                a.add(tmp[i]);
            }
        }
        for (int i = 1; i < a.size(); i++) {
            String word = Character.toUpperCase(a.get(i).charAt(0)) + a.get(i).substring(1);
            if (i != a.size() - 1) {
                System.out.printf("%s ", word);

            } else {
                System.out.printf("%s, ", word);
            }
        }
        String firstName = a.get(0).toUpperCase();
        System.out.println(firstName);
    }
    public static void testCase2() {
        String s = input.nextLine().trim().toLowerCase();
        String[] a = s.split("\\s+");
        int n = a.length;
        for (int i = 1; i < n - 1; ++i)
            System.out.print(String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1) + " ");
        System.out.print(String.valueOf(a[n - 1].charAt(0)).toUpperCase() + a[n - 1].substring(1) + ", ");
        System.out.println(a[0].toUpperCase());
    }
}
