package j05026;

import java.util.ArrayList;
import java.util.Scanner;

public class j05026 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Lecturer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Lecturer(input.nextLine(), input.nextLine()));
        }
        int q = Integer.parseInt(input.nextLine());
        while (q-- > 0) {
            String inputDepartment = input.nextLine();
            System.out.printf("DANH SACH GIANG VIEN BO MON %s:\n", Lecturer.formatDepartment(inputDepartment));
            for (Lecturer x : a) {
                if (x.getDepartment().equals(inputDepartment)) {
                    System.out.println(x);
                }
            }
        }
        input.close();
    }
}
