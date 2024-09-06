package J05079;
import java.util.*;
public class J05079 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Course> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Course(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        int m = Integer.parseInt(input.nextLine());
        for (int i = 0; i < m; i++) {
            String courseId = input.nextLine();
            System.out.printf("Danh sach nhom lop mon %s:\n", Course.getCourseIdToNameMap().get(courseId));
            for (Course x : a) {
                if (x.getId().equals(courseId)) {
                    System.out.println(x);
                }
            }
        }
    }
}
