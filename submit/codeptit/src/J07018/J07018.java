package J07018;

import java.io.IOException;
import java.util.*;
import java.io.*;

public class J07018 {
    public static void main(String[] args) throws IOException {
        // Write your code here
        // Scanner input = new Scanner(new File("J07018/SINHVIEN.in"));
        Scanner input = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Student(input.nextLine(), input.nextLine(), input.nextLine(), Double.parseDouble(input.nextLine())));
        }
        for (Student x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
