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

        int n = Integer.parseInt(input1.nextLine().trim());
        for (int i = 0; i < n; i++) {
            new Course(input1.nextLine().trim(), input1.nextLine().trim(), input1.nextLine().trim());
        }

        int m = Integer.parseInt(input2.nextLine().trim());
        ArrayList<Section> sections = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            sections.add(new Section(input2.nextLine().trim(), input2.nextLine().trim(), input2.nextLine().trim()));
        }

        int p = Integer.parseInt(input3.nextLine().trim());
        for (int i = 0; i < p; i++) {
            Schedule schedule = new Schedule(input3.nextLine().trim());
            sections.get(i).setSchedule(schedule);
        }

        Collections.sort(sections, new CompareByDateAndId());
        for (Section x : sections) {
            System.out.println(x);
        }

        input1.close();
        input2.close();
        input3.close();
    }
}
