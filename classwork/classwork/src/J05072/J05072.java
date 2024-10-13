package J05072;
import java.util.*;
import java.io.*;
public class J05072 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Call> calls = new ArrayList<>();
        ArrayList<City> cities = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            cities.add(new City(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine())));
        }
        int m  = Integer.parseInt(input.nextLine());
        for (int i = 0; i < m; i++) {
            calls.add(new Call(input.nextLine()));
        }
        Collections.sort(calls);
        for (Call x  : calls) {
            System.out.println(x);
        }

        input.close();
    }
}
