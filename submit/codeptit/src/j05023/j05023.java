package j05023;

import java.util.ArrayList;
import java.util.Scanner;

public class j05023 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Student(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        int q = Integer.parseInt(input.nextLine());
        while (q-- > 0) {
            String s = input.nextLine();
            String year = s.substring(2);
            System.out.printf("DANH SACH SINH VIEN KHOA %s:\n", s);
            for (Student x : a) {
                if (x.getClassName().substring(1,3).equals(year)) {
                    System.out.println(x);
                }
            }
        }

        input.close();
    }
}
