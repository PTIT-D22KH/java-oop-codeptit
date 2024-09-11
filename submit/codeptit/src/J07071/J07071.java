package J07071;
import java.util.*;
import java.io.*;
public class J07071 {
    public static void main(String[] args) throws IOException{
        // Write your code here
        // Scanner input = new Scanner(new File("J07071/DANHSACH.in"));
        Scanner input = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Name> names = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            names.add(new Name(input.nextLine()));
        }
        Collections.sort(names, new CompareByName());
        int q = Integer.parseInt(input.nextLine());
        for (int i = 0; i < q; i++) {
            String s = input.nextLine();
            // System.out.println(s);
            for (Name name : names) {
                // System.out.println(name);
                if (name.isMatchedPattern(s)) {
                    System.out.println(name);
                }
            }
        }
        input.close();
    }
}
