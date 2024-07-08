package j07002;
import java.util.Scanner;


import java.io.File;
import java.io.IOException;
public class j07002 {
    public static void main(String[] args) throws IOException{
        // Write your code here
        // Scanner input = new Scanner(new File("j07002/DATA.in"));
        Scanner input = new Scanner(new File("DATA.in"));
        long sum = 0;
        String s;
        while (input.hasNext()) {
            s = input.next();
            try {
                sum += (Integer.parseInt(s));
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println(sum);
        input.close();
    }   
}
