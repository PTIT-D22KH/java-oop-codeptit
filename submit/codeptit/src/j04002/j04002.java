package j04002;

import java.util.Scanner;

public class j04002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height, width;
        String color;
        height = input.nextDouble();
        width = input.nextDouble();
        color = input.next();
        
        if (height > 0 && width > 0) {
            Rectangle a = new Rectangle(width, height, color);
            System.out.printf("%d %d %s", (int)a.findPerimeter(), (int)a.findArea(), Rectangle.getColor());
        } else {
            System.out.println("INVALID");
        }
        
        input.close();
    }
}