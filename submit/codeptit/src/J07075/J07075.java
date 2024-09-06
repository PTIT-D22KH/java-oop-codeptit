package J07075;
import java.util.*;
import java.io.*;

public class J07075 {
    public static void main(String[] args) throws IOException{
        // Write your code here
        Scanner input1 = new Scanner(new File("J07075/MONHOC.in"));
        Scanner input2 = new Scanner(new File("J07075/LICHGD.in"));

        // Scanner input1 = new Scanner(new File("MONHOC.in"));
        // Scanner input2 = new Scanner(new File("LICHGD.in"));
        int n = Integer.parseInt(input1.nextLine());
        ArrayList<Course> courses = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            courses.add(new Course(input1.nextLine().trim(), input1.nextLine().trim(), Integer.parseInt(input1.nextLine().trim())));
        }
        int m = Integer.parseInt(input2.nextLine());
        ArrayList<Section> sections = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            sections.add(new Section(input2.nextLine().trim(), Integer.parseInt(input2.nextLine().trim()), Integer.parseInt(input2.nextLine().trim()), input2.nextLine().trim(), input2.nextLine().trim()));
        }
        Collections.sort(sections, new CompareByTimeAndLectureName());
        String lecturerName = input2.nextLine().trim();
        System.out.printf("LICH GIANG DAY GIANG VIEN %s:\n", lecturerName);
        for(Section x : sections) {
            if (x.getLecturerName().equals(lecturerName)) {
                System.out.println(x);
            }
            
        }


        input1.close();
        input2.close();
    }
}
