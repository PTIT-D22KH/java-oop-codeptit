package J07034;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.io.*;
public class J07034 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // Write your code here
        // Scanner input = new Scanner(new File("J07034/MONHOC.in"));
        Scanner input = new Scanner(new File("MONHOC.in"));

        int n = Integer.parseInt(input.nextLine());
        ArrayList<Course> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Course(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine())));
        }
        Collections.sort(a, new CompareByName());
        for (Course x : a) {
            System.out.println(x);
        }

        input.close();
    }
}
