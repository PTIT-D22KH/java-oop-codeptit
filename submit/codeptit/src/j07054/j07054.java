package j07054;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class j07054 {
    public static void main(String[] args) throws IOException{
        // Write your code here
        // Scanner input = new Scanner(new File("j07054/BANGDIEM.in"));
        Scanner input = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> students = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            students.add(new Student(input.nextLine(), Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine())));
        }
        Collections.sort(students, new CompareByAverageScoreDesc());
        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0 || students.get(i).getAverageScore() != students.get(i - 1).getAverageScore()) {
                rank = i + 1;
            }
            students.get(i).setRank(rank);
        }
        for (Student x : students ) {
            System.out.println(x);
        }
        input.close();
    }
}
