package J05013;

import java.util.Comparator;

public class Contestant {
    private String id, name, result;
    private static int count = 0;
    private double ltScore, thScore, avgScore;
    public Contestant(String name, String ltScore, String thScore) {
        this.name = name;
        this.ltScore = normalizeScore(ltScore);
        this.thScore = normalizeScore(thScore);
        count++;
        this.id = String.format("TS%02d", count);
        this.avgScore = (this.ltScore + this.thScore) / (2.0);
        this.result = calResult(this.avgScore);
    }
    private String calResult(double avgScore) {
        if (avgScore > 9.5) {
            return "XUAT SAC";
        } else if (avgScore >= 8) {
            return "DAT";
        } else if (avgScore >= 5) {
            return "CAN NHAC";
        }
        return "TRUOT";
    }
    private double normalizeScore(String score) {
        double score_double = Double.parseDouble(score);
        int score_int = (int)score_double;
        if (score_int > 10) {
            String newScore = score.substring(0, 1) + "." + score.substring(1);
            return Double.parseDouble(newScore);
        } 
        return score_double;
    }

    public double getAvgScore() {
        return avgScore;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f ", avgScore) + result;
    }

}
class CompareByAvgScore implements Comparator<Contestant> {
    @Override
    public int compare(Contestant a, Contestant b) {
        return Double.compare(b.getAvgScore(), a.getAvgScore());
    }
}