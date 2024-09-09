package J05080;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05080 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Course> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Course(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(a, new CompareByIdAndGroup());
        int m = Integer.parseInt(input.nextLine());
        for (int i = 0; i < m; i++) {
            String lecturerName = input.nextLine();
            System.out.printf("Danh sach cho giang vien %s:\n", lecturerName);
            for (Course x : a) {
                if (x.getLecturerName().equals(lecturerName)) {
                    System.out.println(x);
                }
            }
        }
    }
}
