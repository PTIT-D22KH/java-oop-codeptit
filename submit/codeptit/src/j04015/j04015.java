package j04015;

import java.util.Scanner;

public class j04015 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        String id, name;
        int basicSal;
        id = input.nextLine().trim();
        name = input.nextLine().trim();
        basicSal = input.nextInt();
        Teacher a = new Teacher(id, name, basicSal);
        System.out.println(a);
        input.close();
    }
}
