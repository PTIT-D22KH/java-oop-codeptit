package J05078;
import java.util.*;
public class J05078 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i< n; i++) {
            Department temp = new Department(input.nextLine());
        }
        int m = Integer.parseInt(input.nextLine());
        ArrayList<Employee> a = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            a.add(new Employee(input.nextLine(), input.nextLine(), Long.parseLong(input.nextLine()), Long.parseLong(input.nextLine())));
        }
        String departmentId = input.nextLine();
        System.out.printf("Bang luong phong %s:\n", Department.getDepartmentMap().get(departmentId).getName());
        for (Employee x : a) {
            if (x.getDepartment().getId().equals(departmentId)) {
                System.out.println(x);
            }
            
        }
        input.close();
    }
}
