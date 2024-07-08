package j07004;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class j07004 {
    public static void main(String[] args) throws IOException{
        // Write your code here
        // Scanner input = new Scanner(new File("j07004/DATA.in"));
        Scanner input = new Scanner(new File("DATA.in"));
        int []fre = new int[1001];
        while (input.hasNextInt()) {
            int x = input.nextInt();
            fre[x]++;
        }
        for (int i = 0; i < 1001; i++) {
            if (fre[i] > 0) {
                System.out.printf("%d %d\n", i, fre[i]);
            }
        }
        input.close();

    }
}
