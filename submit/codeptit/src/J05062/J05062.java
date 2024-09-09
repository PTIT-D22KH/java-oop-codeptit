package J05062;
import java.util.*;
public class J05062 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        String temp[] = input.nextLine().trim().split("\\s+");;
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
        ArrayList<Student> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Student(input.nextLine(), input.nextLine()));
        }
        ArrayList<Student> b = new ArrayList<>();
        b.addAll(a);
        Collections.sort(b, new CompareByGpa());
        double standardGpa = b.get(m - 1).getGpa();
        for (Student x : a) {
            x.setResult(standardGpa);
            System.out.println(x);
        }
        input.close();
    }
}
