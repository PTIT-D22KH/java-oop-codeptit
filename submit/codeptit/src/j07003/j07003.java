package j07003;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class j07003 {
    public static void main(String[] args) throws IOException{
        // Write your code here
        // Scanner input = new Scanner(new File("j07003/DATA.in"));
        Scanner input = new Scanner(new File("DATA.in"));
        String s = input.nextLine();
        if (s.length() == 1) {
            System.out.println(s);
            input.close();
            return;
        }
        while (s.length() > 1) {
            BigInteger a = new BigInteger(s.substring(0, s.length() / 2));
            BigInteger b = new BigInteger(s.substring(s.length() / 2));
            s = a.add(b).toString();
            System.out.println(s);
        }

        input.close();
        
    }
}
