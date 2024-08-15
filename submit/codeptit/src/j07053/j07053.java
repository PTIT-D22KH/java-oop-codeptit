package j07053;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class j07053 {
    public static void main(String[] args) throws IOException{
        // Write your code here
        // Scanner input = new Scanner(new File("XETTUYEN.in"));
        Scanner input = new Scanner(new File("j07053/XETTUYEN.in"));
        int n = Integer.parseInt(input.nextLine());
        List<Contestant> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Contestant(input.nextLine(), input.nextLine(), Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine())));
        }
        for (Contestant x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
