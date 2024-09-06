package J07038;
import java.util.*;
import java.io.*;
public class J07038 {
    public static void main(String[] args) throws IOException{
        // Write your code here
        Scanner input1 = new Scanner(new File("J07038/SINHVIEN.in"));
        Scanner input2 = new Scanner(new File("J07038/DN.in"));
        Scanner input3 = new Scanner(new File("J07038/THUCTAP.in"));

        int n = Integer.parseInt(input1.nextLine());
        ArrayList<Student> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Student(input1.nextLine(), input1.nextLine(), input1.nextLine(), input1.nextLine()));
        }
        int m = Integer.parseInt(input2.nextLine());
        ArrayList<Company> b = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            b.add(new Company(input2.nextLine(), input2.nextLine(), Long.parseLong(input2.nextLine())));

        }
        int p = Integer.parseInt(input3.nextLine());
        for (int i = 0; i < p; i++) {
            String s = input3.nextLine().trim();
            String temp[] = s.split("\\s+");
            for (Student x : a) {
                if (x.getId().equals(temp[0])) {
                    x.setInternCompany(Company.getCompanyMap().get(temp[1]));
                    break;
                }
            }
        }
        int k = Integer.parseInt(input3.nextLine());
        for (int i = 0; i < k; i++)  {
            String companyId = input3.nextLine();
            System.out.printf("DANH SACH THUC TAP TAI %s:\n", Company.getCompanyMap().get(companyId).getName());
            long count = 0;
            for (Student x : a) {
                if (x.getInternCompany().getId().equals(companyId) && count <= x.getInternCompany().getNumStudents()) {
                    System.out.println(x);
                    count++;
                }
            }
        }
        input1.close();
        input2.close();
        input3.close();



    }
}
