package j05025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05025 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Lecturer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Lecturer(input.nextLine(), input.nextLine()));
        }
        Collections.sort(a, new CompareByFirstNameAndId());
        for (Lecturer x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
