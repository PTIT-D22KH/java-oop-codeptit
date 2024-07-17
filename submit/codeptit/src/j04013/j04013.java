package j04013;

import java.util.Scanner;

public class j04013 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        String id, name;
        double score1, score2, score3;
        id = input.nextLine().trim();
        name = input.nextLine().trim();
        score1 = input.nextDouble();
        score2 = input.nextDouble();
        score3 = input.nextDouble();
        Contestant a = new Contestant(id, name, score1, score2, score3);
        System.out.println(a);
        input.close();
    }
}
