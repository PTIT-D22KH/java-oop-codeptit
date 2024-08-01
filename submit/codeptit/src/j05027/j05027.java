package j05027;

import java.util.ArrayList;
import java.util.Scanner;

public class j05027 {
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
            String inputName = input.nextLine();
            System.out.printf("DANH SACH GIANG VIEN THEO TU KHOA %s:\n", inputName);
            for (Lecturer x : a) {
                if (x.getName().toLowerCase().contains(inputName.toLowerCase())) {
                    System.out.println(x);
                }
            }
        }
        input.close();
    }
}
