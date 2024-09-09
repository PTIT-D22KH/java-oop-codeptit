package J02009;

import java.util.*;
import java.util.Scanner;

public class J02009 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Passenger> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Passenger(input.nextInt(), input.nextInt()));

        }
        input.close();
        Collections.sort(a, new CompareByArrivalTime());
        int current = 0;
        for (Passenger x : a) {
            if (x.getArrivalTime() > current) {
                current = x.getArrivalTime();
            }
            current += x.getDuration();
        }
        System.out.println(current);
    }   
}
