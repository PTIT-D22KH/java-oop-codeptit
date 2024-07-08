package j07022;
import java.util.*;
import java.io.*;
public class j07022 {
    public static void main(String[] args) throws IOException {
        // Write your code here
        // Scanner input = new Scanner(new File("j07022/DATA.in"));
        Scanner input = new Scanner(new File("DATA.in"));
        ArrayList<String> a = new ArrayList<>();
        while (input.hasNext()) {
            String s = input.next();
            try {
                Integer.parseInt(s);
            } catch (Exception e) {
                // TODO: handle exception
                a.add(s);
            }
            
        }
        Collections.sort(a);
        for (String s: a) {
            System.out.printf("%s " , s);
        }
        input.close();
    }
}
