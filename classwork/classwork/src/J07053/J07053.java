package J07053;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class J07053 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // Write your code here
        Scanner input = new Scanner(new File("J07053/XETTUYEN.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Contestant> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Contestant(input.nextLine(), input.nextLine(), Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine())));
        }
        for (Contestant x : a) {
            System.out.println(x);
        }

        input.close();
    }
}
