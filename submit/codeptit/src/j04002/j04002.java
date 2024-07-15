package j04002;

import java.util.Scanner;

public class j04002 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        double height, width;
        String color;
        height = input.nextDouble();
        width = input.nextDouble();
        color = input.next();
        Rectangle a = new Rectangle(height, width, color);
        System.out.printf("%d %d %s", (int)a.findPerimeter(), (int)a.findArea(), Rectangle.getColor());
        input.close();
    }
}
