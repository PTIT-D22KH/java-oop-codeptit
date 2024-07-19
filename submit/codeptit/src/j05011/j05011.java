package j05011;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05011 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Gamer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++ ){
            String id, name, inString, outString;
            id = input.nextLine();
            name = input.nextLine();
            inString = input.nextLine();
            outString = input.nextLine();
            a.add(new Gamer(id, name, inString, outString));
        }
        Collections.sort(a, Gamer.BY_PLAY_TIME_DESC);
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
        input.close();
    }
}
