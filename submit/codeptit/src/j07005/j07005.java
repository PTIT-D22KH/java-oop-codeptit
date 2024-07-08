package j07005;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class j07005 {
    public static void main(String[] args) throws IOException {
        // Write your code here
        DataInputStream input = new DataInputStream(new FileInputStream("j07005/DATA.in"));
        int []fre = new int[1001];
        for (int i = 0; i < 1000000; i++) {
            fre[input.readInt()]++;
        }
        for (int i = 0; i < 1001; i++) {
            if (fre[i] > 0) {
                System.out.printf("%d %d\n", i, fre[i]);
            }
        }
        input.close();

    }
}
