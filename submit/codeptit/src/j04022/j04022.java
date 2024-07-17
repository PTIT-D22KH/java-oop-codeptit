package j04022;

import java.util.Scanner;


public class j04022 {
    public static void main(String[] args) {
        // Write your code here
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));

        in.close();
    }
}
