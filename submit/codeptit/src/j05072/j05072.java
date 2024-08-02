package j05072;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05072 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        while (n-- > 0) {
            Call.getCityMap().put(Integer.parseInt(input.nextLine()), new City(input.nextLine(), Long.parseLong(input.nextLine())));
        }
        n = Integer.parseInt(input.nextLine());
        ArrayList<Call> calls = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            String x[] = input.nextLine().split(" ");
            calls.add(new Call(x[0], x[1], x[2]));
        }
        Collections.sort(calls, new CompareByPrice());
        for (Call x : calls) {
            System.out.println(x);
        }
        input.close();
    }
}
