package j05021;
import java.util.*;
public class j05021 {
    public static void main(String[] args){
        // Write your code here
        Scanner input = new Scanner(System.in);
        ArrayList<Student> a = new ArrayList<>();
        while (input.hasNextLine()) {
            a.add(new Student(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(a, new CompareByClassNameAndId());
        for (Student x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
