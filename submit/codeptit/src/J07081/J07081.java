package J07081;
import java.util.*;
import java.io.*;
public class J07081 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // Write your code here
        // Scanner input = new Scanner(new File("J07081/SINHVIEN.in"));
        Scanner input = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Student(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(a, new CompareByNameAndId());
        for (Student x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
