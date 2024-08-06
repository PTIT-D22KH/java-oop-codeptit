package j07010;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class j07010 {
    public static void main(String[] args) throws FileNotFoundException{
        // Write your code here
        // Scanner input = new Scanner(new File("j07010/SV.in"));
        Scanner input = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Student(input.nextLine(), input.nextLine(), input.nextLine(), Double.parseDouble(input.nextLine())));
        }
        for (Student x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
