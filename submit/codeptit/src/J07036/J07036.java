package J07036;
import java.util.*;
import java.io.*;
public class J07036 {
    public static void main(String[] args) throws IOException {
        // Write your code here
        // Scanner input1 = new Scanner(new File("J07036/SINHVIEN.in"));
        // Scanner input2 = new Scanner(new File("J07036/MONHOC.in"));
        // Scanner input3 = new Scanner(new File("J07036/BANGDIEM.in"));

        Scanner input1 = new Scanner(new File("SINHVIEN.in"));
        Scanner input2 = new Scanner(new File("MONHOC.in"));
        Scanner input3 = new Scanner(new File("BANGDIEM.in"));

        int n = Integer.parseInt(input1.nextLine().trim());
        for (int i = 0; i < n; i++) {
            new Student(input1.nextLine().trim(), input1.nextLine().trim(), input1.nextLine().trim(), input1.nextLine().trim());
        }

        int m = Integer.parseInt(input2.nextLine().trim());
        for (int i = 0; i < m; i++) {
            new Course(input2.nextLine().trim(), input2.nextLine().trim(), Integer.parseInt(input2.nextLine().trim()));
        }

        int p = Integer.parseInt(input3.nextLine().trim());
        ArrayList<Transcript> transcripts = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            transcripts.add(new Transcript(input3.nextLine().trim()));
        }

        Collections.sort(transcripts, new CompareByCourseIdAndStudentId());

        int k = Integer.parseInt(input3.nextLine().trim());
        for (int i = 0; i < k; i++) {
            String className = input3.nextLine().trim();
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
