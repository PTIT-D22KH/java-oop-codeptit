package J05064;
import java.util.*;
public class J05064 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Teacher> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = input.nextLine();
            String name = input.nextLine();
            int basicSalary = Integer.parseInt(input.nextLine());
            String role = id.substring(0, 2);
            if (role.equals("HT") && Teacher.getCountHT() == 1) {
                continue;
            }
            if (role.equals("HP") && Teacher.getCountHP() == 2) {
                continue;
            }
            a.add(new Teacher(id, name, basicSalary));
        }
        for (Teacher x : a) {
            System.out.println(x);
        }
        input.close();

    }
}
