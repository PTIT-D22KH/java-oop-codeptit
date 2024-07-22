package j05013;
import java.util.*;
public class Candidate {
    private String name, id, result;

    private double ltScore, thScore, averageScore;
    private static int count = 0;

    
    public Candidate(String name, double ltScore, double thScore)  {
        this.name = name;
        this.ltScore = reformat(ltScore);
        this.thScore = reformat(thScore);
        count++;
        String s = String.valueOf(count);
        if (s.length() == 1) {
            s = "0" + s;
        }
        this.id = "TS" + s;
        this.result = calResult();
    }
    private String calResult() {
        this.averageScore = (this.ltScore + this.thScore) / 2.0;
        if (averageScore < 5) {
            return "TRUOT";
        } else if (averageScore < 8) {
            return "CAN NHAC";
        } else if (averageScore <= 9.5) {
            return "DAT";
        } else {
            return "XUAT SAC";
        }
    }
    private double reformat(double score) {
        if (score > 10) {
            score = (1.0 * score) / 10.0;
        }
        return score;
    }

    public double getAverageScore() {
        return averageScore;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f ", averageScore) +  result;
    }

}
class CompareByAverageScore implements Comparator<Candidate> {

    @Override
    public int compare(Candidate o1, Candidate o2) {
        // TODO Auto-generated method stub
        if (o1.getAverageScore() < o2.getAverageScore()) {
            return 1;
        } 
        return -1;
        
    }
    
}