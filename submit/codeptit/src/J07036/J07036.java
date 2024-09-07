package J07036;
import java.util.*;
import java.io.*;
public class J07036 {
    public static void main(String[] args) throws IOException {
        // Write your code here
        Scanner input1 = new Scanner(new File("J07036/SINHVIEN.in"));
        Scanner input2 = new Scanner(new File("J07036/MONHOC.in"));
        Scanner input3 = new Scanner(new File("J07036/BANGDIEM.in"));

        // Scanner input1 = new Scanner(new File("SINHVIEN.in"));
        // Scanner input2 = new Scanner(new File("MONHOC.in"));
        // Scanner input3 = new Scanner(new File("BANGDIEM.in"));

        int n = Integer.parseInt(input2.nextLine());
        ArrayList<Course> courses = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            courses.add(new Course(input2.nextLine(), input2.nextLine(), Integer.parseInt(input2.nextLine())));
        }
        int m = Integer.parseInt(input1.nextLine()) ;
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            students.add(new Student(input1.nextLine(), input1.nextLine(), input1.nextLine(), input1.nextLine()));
        }
        int p = Integer.parseInt(input3.nextLine());
        ArrayList<Transcript> transcripts = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            transcripts.add(new Transcript(input3.nextLine()));
        }
        Collections.sort(transcripts, new CompareByCourseIdAndStudentId());
        int k = Integer.parseInt(input3.nextLine());
        for (int i = 0; i < k; i++) {
            String className = input3.nextLine();
            System.out.printf("BANG DIEM lop %s:\n", className);
            for (Transcript x : transcripts) {
                if (x.getStudent().getClassName().equals(className)) {
                    System.out.println(x);
                }
            }
        }


        input1.close();
        input2.close();
        input3.close();
    }
}
