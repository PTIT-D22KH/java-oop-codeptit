package J07038;
import java.util.*;
import java.io.*;

public class J07038 {
    public static void main(String[] args) throws IOException {
        Scanner input1 = new Scanner(new File("SINHVIEN.in"));
        Scanner input2 = new Scanner(new File("DN.in"));
        Scanner input3 = new Scanner(new File("THUCTAP.in"));

        int n = Integer.parseInt(input1.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            students.add(new Student(input1.nextLine(), input1.nextLine(), input1.nextLine(), input1.nextLine()));
        }

        int m = Integer.parseInt(input2.nextLine());
        ArrayList<Company> companies = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            companies.add(new Company(input2.nextLine(), input2.nextLine(), Long.parseLong(input2.nextLine())));
        }

        int p = Integer.parseInt(input3.nextLine());
        for (int i = 0; i < p; i++) {
            String s = input3.nextLine().trim();
            String[] temp = s.split("\\s+");
            for (Student student : students) {
                if (student.getId().equals(temp[0])) {
                    student.setInternCompany(Company.getCompanyMap().get(temp[1]));
                    break;
                }
            }
        }

        int k = Integer.parseInt(input3.nextLine());
        for (int i = 0; i < k; i++) {
            String companyId = input3.nextLine();
            System.out.printf("DANH SACH THUC TAP TAI %s:\n", Company.getCompanyMap().get(companyId).getName());
            List<Student> interns = new ArrayList<>();
            for (Student student : students) {
                if (student.getInternCompany() != null && student.getInternCompany().getId().equals(companyId)) {
                    interns.add(student);
                }
            }
            Collections.sort(interns, new CompareById());
            long count = 0;
            for (Student intern : interns) {
                if (count < intern.getInternCompany().getNumStudents()) {
                    System.out.println(intern);
                    count++;
                }
            }
        }

        input1.close();
        input2.close();
        input3.close();
    }
}