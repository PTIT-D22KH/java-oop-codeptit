package j05020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05020 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Student(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(a, new CompareByClassNameAndId());

        for (Student x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
