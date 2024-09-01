package J07037;

import java.io.FileNotFoundException;
import java.io.*;
import java.util.*;
public class J07037 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // Write your code here
        // Scanner input = new Scanner(new File("J07037/DN.in"));
        Scanner input = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Company> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Company(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine())));
        }
        
        Collections.sort(a, new CompareById());
        for (Company x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
