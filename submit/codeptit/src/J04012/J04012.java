package J04012;

import java.util.Scanner;

public class J04012 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        System.out.println(new Employee(input.nextLine(), Long.parseLong(input.nextLine()), Long.parseLong(input.nextLine()), input.nextLine()));
        input.close();
    }
}
