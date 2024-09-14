package ArrayListLearn;
import java.util.*;
public class ArrayListLearn {
    public static void main(String[] args) {
        // Write your code here
        ArrayList<String> names = new ArrayList<>();
        names.add("Asa");
        names.add("Nathan");
        names.add(1, "Test");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Asada");
        names2.add("Nathaniel");
        names2.add(1, "Testing");

        names.addAll(names2);
        ArrayList<String> names3 = new ArrayList<>();
        names3.addAll(names);
        names3.retainAll(names2);
        for (String x : names3) {
            System.out.println(x);
        }
        System.out.println("------------------");
        for (String x : names) {
            System.out.println(x);
        }
    }
}
