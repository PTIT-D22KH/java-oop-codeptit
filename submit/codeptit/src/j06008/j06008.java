package j06008;

import java.util.ArrayList;
import java.util.Scanner;

public class j06008 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
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
        n = Integer.parseInt(input.nextLine());
        while (n-- > 0) {
            String s = input.nextLine();
            String x[] = s.split(" ");
            Course.getCourseMap().se
            Lecturer.getLecturerMap().get(x[0]).setCourses(x[1]);
            Lecturer.getLecturerMap().get(x[0]).setNumHours(Double.parseDouble(x[2]));
        }
        String inputLecturer = input.nextLine();
        input.close();
    }
}
