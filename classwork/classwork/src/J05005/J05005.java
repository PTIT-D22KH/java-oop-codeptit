package J05005;
import java.text.ParseException;
import java.util.*;
public class J05005 {
    public static void main(String[] args) throws NumberFormatException, ParseException {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Student(input.nextLine(), input.nextLine(), input.nextLine(), Double.parseDouble(input.nextLine())));
        }
        for (Student x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
