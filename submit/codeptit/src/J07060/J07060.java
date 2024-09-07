package J07060;
import java.util.*;
import java.io.*;
public class J07060 {
    public static void main(String[] args) throws IOException{
        // Write your code here
        // Scanner input1 = new Scanner(new File("J07060/MONTHI.in"));
        // Scanner input2 = new Scanner(new File("J07060/CATHI.in"));
        // Scanner input3 = new Scanner(new File("J07060/LICHTHI.in"));

        Scanner input1 = new Scanner(new File("MONTHI.in"));
        Scanner input2 = new Scanner(new File("CATHI.in"));
        Scanner input3 = new Scanner(new File("LICHTHI.in"));

        int n = Integer.parseInt(input1.nextLine());
        ArrayList<Course> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Course(input1.nextLine(), input1.nextLine(), input1.nextLine()));

        }
        int m = Integer.parseInt(input2.nextLine());
        ArrayList<Section> b = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            b.add(new Section(input2.nextLine(), input2.nextLine(), input2.nextLine()));
        }
        int p = Integer.parseInt(input3.nextLine());
        ArrayList<Schedule> c = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            c.add(new Schedule(input3.nextLine()));
            b.get(i).setSchedule(c.get(i));
        }
        Collections.sort(b, new CompareByDateAndId());
        for (Section x : b) {
            System.out.println(x);
        }


        input1.close();
        input2.close();
        input3.close();
    }
}
