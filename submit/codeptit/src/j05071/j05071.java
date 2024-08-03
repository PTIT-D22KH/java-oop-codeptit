package j05071;

import java.util.Scanner;

public class j05071 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        while (n-- > 0) {
            Call.getCityMap().put(Integer.parseInt(input.nextLine()), new City(input.nextLine(), Long.parseLong(input.nextLine())));
        }
        n = Integer.parseInt(input.nextLine());
        while (n-- > 0) {
            String a[] = input.nextLine().split(" ");
            System.out.println(new Call(a[0], a[1], a[2]));
        }
        input.close();

    }
}
