package J05074;
import java.util.*;
public class J05074 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Student(input.nextLine(), input.nextLine(), input.nextLine()));
        }
        for (int i = 0; i < n; i++) {
            String s = input.nextLine();
            String b[] = s.trim().split("\\s+");
            String id = b[0];
            String attendance = b[1];
            for (Student x : a) {
                if (x.getId().equals(id)) {
                    x.setAttendance(attendance);
                    x.calScore();
                    break;
                }
            }
        }
        for (Student x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
