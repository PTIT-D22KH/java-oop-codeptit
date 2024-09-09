package J07074;
import java.io.*;
import java.util.*;
public class J07074 {
    public static void main(String[] args) throws IOException{
        // Write your code here
        // Scanner input1 = new Scanner(new File("J07074/MONHOC.in"));
        // Scanner input2 = new Scanner(new File("J07074/LICHGD.in"));

        Scanner input1 = new Scanner(new File("MONHOC.in"));
        Scanner input2 = new Scanner(new File("LICHGD.in"));
        int n = Integer.parseInt(input1.nextLine());
        ArrayList<Course> courses = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            courses.add(new Course(input1.nextLine(), input1.nextLine(), Integer.parseInt(input1.nextLine())));
        }
        int m = Integer.parseInt(input2.nextLine());
        ArrayList<Section> sections = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            sections.add(new Section(input2.nextLine(), Integer.parseInt(input2.nextLine()), Integer.parseInt(input2.nextLine()), input2.nextLine(), input2.nextLine()));
        }
        Collections.sort(sections, new CompareByTimeAndLectureName());
        String courseId = input2.nextLine();
        System.out.printf("LICH GIANG DAY MON %s:\n", Course.getCourseIdToName().get(courseId));
        for(Section x : sections) {
            if (x.getCourseId().equals(courseId)) {
                System.out.println(x);
            }
            
        }


        input1.close();
        input2.close();
    }
}
