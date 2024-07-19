package j05009;
import java.util.Comparator;
public class Contestant {
    private int id;
    private String name, dob;
    double m1, m2, m3, totalScore;
    private static int count = 0;
    public static final Comparator<Contestant> BY_TOTAL_SCORE = new Comparator<Contestant> () {
        @Override
        public int compare(Contestant a, Contestant b) {
            int compareScore = Double.compare(b.totalScore, a.totalScore);
            if (compareScore == 0) {
                return Integer.compare(a.id, b.id);
            }
            return compareScore;
        }
    };
    public Contestant(String name, String dob, double m1, double m2, double m3) {
        this.name = name;
        this.dob = dob;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        count++;
        this.id = count;
        this.totalScore = m1 + m2 + m3;
    }
    public double getTotalScore() {
        return totalScore;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + dob + " " + totalScore;
    }



    
    
}
