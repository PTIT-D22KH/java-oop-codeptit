package HELLOFILE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HELLOFILE {
    public static void main(String[] args) throws FileNotFoundException {
        // Write your code here
        // Scanner input = new Scanner(new File("HELLOFILE/Hello.txt"));
        Scanner input = new Scanner(new File("Hello.txt"));
        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }
        input.close();
    }
}
