package j04005;

import java.util.Scanner;

public class j04005 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        String name = input.nextLine().trim();
        String dob = input.nextLine().trim();
        double score1 = input.nextDouble();
        double score2 = input.nextDouble();
        double score3 = input.nextDouble();
        Contestant a = new Contestant(name, dob, score1, score2, score3);
        System.out.println(a);
        input.close();
    }
}
