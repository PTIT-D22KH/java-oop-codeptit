package J05058;
import java.util.*;
public class Contestant {
    private String id, name, result;
    private int area;
    private double  score1, score2, score3, priorityScore, totalScore, basicScore;
    public Contestant(String id, String name, double score1, double score2, double score3) {
        this.id = id;
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.area = calArea();
        this.priorityScore = calPriorityScore();
        
        this.basicScore = calBasicScore();
        this.totalScore = calTotalScore();
        this.result = calResult();
    }
    private double calBasicScore() {
        return score1 * 2 + score2 + score3;
    }
    private int calArea(){ 
        return Integer.parseInt(id.substring(2,3));
    }
    private double calPriorityScore(){ 
        if (area == 1) {
            return 0.5;
        } else if (area == 2) {
            return 1.0;
        }
        return 2.5;
    }
    private double calTotalScore(){ 
        return basicScore + priorityScore;
    }
    private String calResult(){
        // System.out.println(totalScore);
        if (totalScore < 24.0) {
            return "TRUOT";
        }
        return "TRUNG TUYEN";
    }
    public double getTotalScore() {
        return totalScore;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString(){ 
        if (totalScore- (int)(totalScore) == 0.0) {
            if (priorityScore - (int)(priorityScore) == 0.0) {
                return id + " " + name + String.format(" %.0f", priorityScore) + String.format(" %.0f ", totalScore) + result;
            }
            return id + " " + name + String.format(" %.1f", priorityScore) + String.format(" %.0f ", totalScore) + result;
        } else {
            if (priorityScore - (int)(priorityScore) == 0.0) {
                return id + " " + name + String.format(" %.0f", priorityScore) + String.format(" %.1f ", totalScore) + result;
            }
            return id + " " + name + String.format(" %.1f", priorityScore) + String.format(" %.1f ", totalScore) + result;
        }
        
    }
}
class CompareByTotalScoreAndId implements Comparator<Contestant> {
    @Override
    public int compare(Contestant a, Contestant b) {
        int cmpTotalScore = Double.compare(b.getTotalScore(), a.getTotalScore());
        if (cmpTotalScore == 0) {
            return a.getId().compareTo(b.getId());
        }
        return cmpTotalScore;
    }
}