package J05054;
import java.util.*;
public class J05054 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Student(input.nextLine(), Double.parseDouble(input.nextLine())));
        }
        ArrayList<Student> b = new ArrayList<>();
        b.addAll(a);
        Collections.sort(b, new CompareByAvgScore());
        b.get(0).setRank(1);
        int rank = 1;
        double curr = b.get(0).getAverageScore();
        for (int i = 1; i < n; i++) {
            if (curr == b.get(i).getAverageScore()) {
                b.get(i).setRank(rank);
            } else {
                rank = i + 1;
                b.get(i).setRank(rank);
            }
        }
        for (Student student : a) {
            for (Student sortedStudent : b) {
                if (student.getName().equals(sortedStudent.getName()) && student.getAverageScore() == sortedStudent.getAverageScore()) {
                    student.setRank(sortedStudent.getRank());
                    break;
                }
            }
        }
        for (Student student : a) {
            System.out.println(student);
        }
        input.close();
    }
}
