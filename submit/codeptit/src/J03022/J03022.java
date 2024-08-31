package J03022;

import java.util.Scanner;

public class J03022 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        while (input.hasNextLine()) {
            String temp = input.nextLine().trim();
            s.append(temp);
        }
        input.close();
        String x = s.toString();
        String a[] = x.toLowerCase().split("[.?!]");
        for (String temp: a) {
            String o = temp.trim();
            StringBuilder i = new StringBuilder();
            i.append(Character.toUpperCase(o.charAt(0))).append(o.substring(1));
            for (String j : i.toString().trim().split("\\s+")) {
                // StringBuilder p = new StringBuilder();
                // p.append(Character.toUpperCase(j.charAt(0))).append(j.substring(1));
                System.out.printf("%s ", j);
            }
            System.out.println();
        }

    }
}
