package j05032;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05032 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Person> a = new ArrayList<Person>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Person(input.next(), input.next()));
        }
        Collections.sort(a, new CompareByAge());
        System.out.println(a.get(0).getName());
        System.out.println(a.get(n - 1).getName());    
        input.close();
    }
}
