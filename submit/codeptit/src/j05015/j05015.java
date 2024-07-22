package j05015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05015 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        ArrayList<Racer> a = new ArrayList<>(n);
        for (int i= 0; i < n; i++) {
            String name, place, finishTimeString;
            name = input.nextLine();
            place = input.nextLine();
            finishTimeString = input.nextLine();
            a.add(new Racer(name, place, finishTimeString));
        }
        Collections.sort(a, new CompareByFinishTime());
        for (int i =0; i < n; i++) {
            System.out.println(a.get(i));
        }
        input.close();
    }
}
