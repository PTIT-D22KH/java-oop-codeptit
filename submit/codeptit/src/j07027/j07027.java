package j07027;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j07027 {
    public static void main(String[] args) throws IOException {
        // Write your code here
        // Scanner input = new Scanner(new File("j07027/SINHVIEN.in"));
        Scanner input = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            students.add(new Student(input.nextLine(), input.nextLine(), input.nextLine()));
        }
        input.close();
        input = new Scanner(new File("BAITAP.in"));
        // input = new Scanner(new File("j07027/BAITAP.in"));
        int m = Integer.parseInt(input.nextLine());
        
        for (int i = 1; i <= m; i++) {
            String s = input.nextLine();
            ManagedApp.getAssignmentName().put(String.valueOf(i), s);
        }
        input.close();
        input = new Scanner(new File("NHOM.in"));
        // input = new Scanner(new File("j07027/NHOM.in"));
        while (input.hasNextLine()) {
            String s = input.nextLine();
            String a[] = s.split(" ");
            String id = a[0];
            String group = a[1];
            Student.getStudentMap().get(id).setGroup(group);
        }
        input.close();
        Collections.sort(students, new CompareById());
        for (Student x : students) {
            System.out.print(x);
            System.out.println(ManagedApp.getAssignmentName().get(x.getGroup()));
        }


    }
}
