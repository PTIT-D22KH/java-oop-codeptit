package J07058;

import java.io.File;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class J07058 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // Write your code here
        Scanner input = new Scanner(new File("J07058/MONHOC.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Course> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Course(input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(a, new CompareById());
        for (Course x : a) {
            System.out.println(x);
        }

        input.close();
    }
}
