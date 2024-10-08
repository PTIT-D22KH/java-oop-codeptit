package J05059;
import java.util.*;
public class J05059 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Contestant> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Contestant(input.nextLine(), input.nextLine(), Double.parseDouble(input.nextLine()),Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine())));
        }
        Collections.sort(a, new CompareByTotalScoreAndId());
        int m = Integer.parseInt(input.nextLine());
        double score = a.get(m - 1).getTotalScore();
        System.out.printf("%.1f\n" , score);
        for (int i = 0; i < n; i++) {
            if (a.get(i).getTotalScore() >= score) {
                System.out.println(a.get(i) + " TRUNG TUYEN");
            } else {
                System.out.println(a.get(i) + " TRUOT");
            }
        }
        input.close();
    }
}
