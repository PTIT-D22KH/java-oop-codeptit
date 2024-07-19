package j05005;
import java.util.*;
public class j05005 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> a = new ArrayList<Student>(n);
        for (int i = 0; i < n; i++) {
            String name = input.nextLine().trim();
            String className = input.nextLine().trim();
            String dob = input.nextLine().trim();
            double gpa = Double.parseDouble(input.nextLine());
            a.add(new Student(name, dob, className, gpa));
        }
        Collections.sort(a, Student.BY_GPA_DESC);   
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
        input.close();
    }
}
