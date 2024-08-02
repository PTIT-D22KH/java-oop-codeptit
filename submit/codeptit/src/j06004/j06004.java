package j06004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class j06004 {
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
        for (int i = 1; i <= m; i++) {
            String s = input.nextLine();
            ManagedApp.getAssignmentName().put(String.valueOf(i), s);
        }
        Collections.sort(students, new CompareById());
        for (Student x : students) {
            System.out.print(x);
            System.out.println(ManagedApp.getAssignmentName().get(x.getGroup()));
        }

        

        input.close();
    }
}
