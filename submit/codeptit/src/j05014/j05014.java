package j05014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05014 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Teacher> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String name, groupId;
            double m1, m2;
            name = input.nextLine();
            groupId = input.nextLine();
            m1 = Double.parseDouble(input.nextLine());
            m2 = Double.parseDouble(input.nextLine());
            a.add(new Teacher(name, groupId, m1, m2));
        }
        Collections.sort(a, new CompareByTotalScore());
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
        input.close();
    }
}
