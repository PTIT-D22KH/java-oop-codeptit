package J07035;
import java.util.*;
import java.io.*;
public class J07035 {
    public static void main(String[] args) throws IOException{
        // Write your code here
        Scanner input1 = new Scanner(new File("J07035/SINHVIEN.in"));
        Scanner input2 = new Scanner(new File("J07035/MONHOC.in"));
        Scanner input3 = new Scanner(new File("J07035/BANGDIEM.in"));

        // Scanner input1 = new Scanner(new File("SINHVIEN.in"));
        // Scanner input2 = new Scanner(new File("MONHOC.in"));
        // Scanner input3 = new Scanner(new File("BANGDIEM.in"));

        int n = Integer.parseInt(input1.nextLine().trim());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            students.add(new Student(input1.nextLine().trim(), input1.nextLine().trim(), input1.nextLine().trim(), input1.nextLine().trim()));
        }

        int m = Integer.parseInt(input2.nextLine().trim());
        ArrayList<Course> courses = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            courses.add(new Course(input2.nextLine().trim(), input2.nextLine().trim(), Integer.parseInt(input2.nextLine().trim())));
        }

        int p = Integer.parseInt(input3.nextLine().trim());
        ArrayList<Transcript> transcripts = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            String studentId = input3.next();
            String courseId = input3.next();
            String gpa = input3.next();
            Student student = new Student();
            Course course = new Course();

            for (Student st : students) {
                if (st.getId().equals(studentId)) {
                    student = st;
                    break;
                }
            }
            for (Course sj : courses) {
                if (sj.getId().equals(courseId)) {
                    course = sj;
                    break;
                }
            }
            transcripts.add(new Transcript(student, course, gpa));
        }

        Collections.sort(transcripts, new CompareByGpaAndId());

        int k = Integer.parseInt(input3.next());
        for (int i = 0; i < k; i++) {
            String courseId = input3.next();
            String courseName = "";
            for (Course cs : courses) {
                if (cs.getId().equals(courseId)) {
                    courseName = cs.getName();
                    break;
                }
            }
            System.out.printf("BANG DIEM MON %s:\n", courseName);
            for (Transcript x : transcripts) {
                if (x.getCourse().getId().equals(courseId)) {
                    System.out.println(x);
                }
            }
        }

        input1.close();
        input2.close();
        input3.close();
    }
}
