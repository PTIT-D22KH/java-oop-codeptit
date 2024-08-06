package j07028;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class j07028 {
    public static void main(String[] args) throws IOException{
        // Write your code here
        // Scanner input = new Scanner(new File("j07028/MONHOC.in"));
        Scanner input = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(input.nextLine());
        while (n-- > 0) {
            String s = input.nextLine();
            String x[] = s.split(" ");
            String y = "";
            for (int i = 1; i < x.length; i++) {
                y += x[i];
                if (i != x.length - 1) {
                    y += " ";
                }
            }
            Course a = new Course(x[0], y);

        }
        input.close();
        // input = new Scanner(new File("j07028/GIANGVIEN.in"));
        input = new Scanner(new File("GIANGVIENC.in"));
        n = Integer.parseInt(input.nextLine());
        ArrayList<Lecturer> lecturers = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String s = input.nextLine();
            String x[] = s.split(" ");
            String y = "";
            for (int j = 1; j < x.length; j++) {
                y += x[j];
                if (j != x.length - 1) {
                    y += " ";
                }
            }
            lecturers.add(new Lecturer(x[0], y));
        }
        input.close();
        // input = new Scanner(new File("j07028/GIOCHUAN.in"));
        input = new Scanner(new File("GIOCHUAN.in"));
        n = Integer.parseInt(input.nextLine());
        while (n-- > 0) {
            String s = input.nextLine();
            String x[] = s.split(" ");
            Course c = new Course(x[0], Course.getCourseMap().get(x[1]).getName());
            Double numHours = Double.parseDouble(x[2]);
            // c.setNumHoursInString(x[2]);
            c.setNumHours(numHours);
            Lecturer.getLecturerMap().get(x[0]).setCourses(c);
            Lecturer.getLecturerMap().get(x[0]).setNumHours(numHours);
        }
        for (Lecturer x : lecturers) {
            System.out.println(x);
        }
        input.close();
    }
}
