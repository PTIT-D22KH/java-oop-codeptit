package J05032;
import java.text.ParseException;
import java.util.*;
public class J05032 {
    public static void main(String[] args) throws ParseException{
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Person> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            a.add(new Person(input.nextLine()));
        }
        Collections.sort(a);
        System.out.println(a.get(0));
        System.out.println(a.get(a.size() - 1));
        input.close();
    }
}
