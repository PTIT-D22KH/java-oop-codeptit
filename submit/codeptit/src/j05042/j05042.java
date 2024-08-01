package j05042;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05042 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String name = input.nextLine();
            String info = input.nextLine();
            String x[] = info.split(" ");

            a.add(new Student(name, Long.valueOf(x[0]), Long.valueOf(x[1])));
            // input.nextLine();
        }
        Collections.sort(a, new CompareByNumTruesAndNumSubmit());
        for (Student x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
