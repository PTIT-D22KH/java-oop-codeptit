package J07073;
import java.util.*;
import java.io.*;
public class J07073 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // Write your code here
        // Scanner input = new Scanner(new File("J07073/MONHOC.in"));
        Scanner input = new Scanner(new File("MONHOC.in"));

        int n = Integer.parseInt(input.nextLine());
        ArrayList<Course> a = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            a.add(new Course(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine()), input.nextLine(), input.nextLine()));
        }
        Collections.sort(a, new CompareById());
        for (Course x : a) {
            if (x.isOnlinePractice()) {
                System.out.println(x);
            }
        }

        input.close();
    }
}
