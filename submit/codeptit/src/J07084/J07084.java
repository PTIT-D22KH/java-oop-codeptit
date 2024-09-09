package J07084;
import java.util.*;
import java.io.*;
public class J07084 {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        // Write your code here
        // Scanner input = new Scanner(new File("J07084/ONLINE.in"));
        Scanner input = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Student(input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(a, new CompareByDurationAndName());
        for (Student x : a) {
            System.out.println(x);
        }
        input.close();  
    }
}
