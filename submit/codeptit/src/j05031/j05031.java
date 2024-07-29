package j05031;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05031 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Student(input.nextLine(), input.nextLine(), input.nextLine(), Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine())));
        }
        Collections.sort(a, new CompareByName());
        for (int i = 0; i < a.size(); i++) {
            System.out.println(String.valueOf(i + 1) + " " + a.get(i));
        }
        input.close();
    }
}
