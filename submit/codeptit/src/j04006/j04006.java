package j04006;

import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class j04006 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        String name = input.nextLine().trim();
        String className = input.nextLine().trim();
        String dob = input.nextLine().trim();
        double gpa = input.nextDouble();
        Student a = new Student(name, className, dob, gpa);
        System.out.println(a);
        input.close();
    }
}
