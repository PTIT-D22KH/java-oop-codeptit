package j07001;
import java.util.*;
import java.io.*;

public class j07001 {
    
    public static void main(String[] args) throws IOException{
        // Write your code here
        // Scanner input = new Scanner(new File("j07001/DATA.in"));
        Scanner input = new Scanner(new File("DATA.in"));
        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }
        input.close();
    }
}
