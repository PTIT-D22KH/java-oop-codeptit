package j06003;

import java.util.ArrayList;
import java.util.Scanner;

public class j06003 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String a1[] = s1.split(" ");
        int n = Integer.parseInt(a1[0]);
        int m = Integer.parseInt(a1[1]);
        
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            students.add(new Student(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }

        for (int i = 0; i < m; i++) {
            ManagedApp.getAssignmentName().put(String.valueOf(i + 1), input.nextLine());
        }

        int q = Integer.parseInt(input.nextLine());
        while (q-- > 0) {
            String s = input.nextLine();
            System.out.printf("DANH SACH NHOM %s:\n", s);
            for (Student x : students) {
                if (x.getGroup().equals(s)) {
                    System.out.println(x);
                }
            }
            System.out.printf("Bai tap dang ky: %s", ManagedApp.getAssignmentName().get(s));
        }

        input.close();
    }
}
