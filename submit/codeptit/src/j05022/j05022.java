package j05022;

import java.util.ArrayList;
import java.util.Scanner;

public class j05022 {
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
            String className = input.nextLine();
            System.out.printf("DANH SACH SINH VIEN LOP %s:\n", className);
            for (Student x : a) {
                if (x.getClassName().equals(className)) {
                    System.out.println(x);
                }
            }
        }
        input.close();
    }
}
