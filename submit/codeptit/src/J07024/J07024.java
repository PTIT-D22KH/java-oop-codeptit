package J07024;
import java.util.*;
import java.io.*;
public class J07024 {
    public static void main(String[] args) throws IOException {
        // Write your code here
        // Scanner input1 = new Scanner(new File("J07024/DATA1.in"));
        // Scanner input2 = new Scanner(new File("J07024/DATA2.in"));

        Scanner input1 = new Scanner(new File("DATA1.in"));
        Scanner input2 = new Scanner(new File("DATA2.in"));

        Set<String> se1 = new TreeSet<>();
        Set<String> se2 = new TreeSet<>();
        while(input1.hasNextLine()) {
            String s = input1.nextLine().trim().toLowerCase();
            // System.out.println(s);
            String a[] = s.split("\\s+");
            for (String x : a) {
                se1.add(x);
            }

        }
        while(input2.hasNextLine()) {
            String s = input2.nextLine().trim().toLowerCase();
            // System.out.println(s);
            String a[] = s.split("\\s+");
            for (String x : a) {
                se2.add(x);
            }
        }
        for (String x : se1) {
            if (!se2.contains(x)) {
                System.out.printf("%s ", x);
            }
        }
        System.out.println();
        for (String x : se2) {
            if (!se1.contains(x)) {
                System.out.printf("%s ", x);
            }
        }
        input1.close();
        input2.close();
    }
}
