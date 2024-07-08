package j07021;
import java.util.*;
import java.io.*;
public class j07021 {
    public static void main(String[] args) throws IOException{
        // Write your code here
        // Scanner input = new Scanner(new File("j07021/DATA.in"));
        Scanner input = new Scanner(new File("DATA.in"));
        while (true) {
            String s = input.nextLine().trim();
            String []a = s.toLowerCase().split("\\s+");
            if (s.equals("END")) {
                break;
            }     
            for (int i = 0; i < a.length; i++) {
                String tmp = String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1);
                System.out.printf("%s ", tmp);
            }
            System.out.println();
            
        }
        input.close();
    }
}
