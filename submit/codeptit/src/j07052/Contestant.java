package j07052;

import java.util.Comparator;

public class Contestant {
    private String id, name, result;
    private double score1, score2, score3, priorityScore, totalScore;
    public Contestant(String id, String name, double score1, double score2, double score3) {
        this.id = id;
        this.name = formatName(name);
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        if (id.charAt(2) == '1') {
            this.priorityScore = 0.5;
        } else if (id.charAt(2) == '2') {
            this.priorityScore = 1;
        } else {
            this.priorityScore = 2.5;
        }
        this.totalScore = this.score1 * 2 + this.score2 + this.score3 + this.priorityScore;
        if (this.totalScore < 24) {
            result = "TRUOT";
        } else{
            result = "TRUNG TUYEN";
        }
    }
    private String formatName(String name) {
        name = name.toLowerCase();
        String a[] = name.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            res.append(Character.toUpperCase(a[i].charAt(0))).append(a[i].substring(1));
            if (i != a.length - 1) {
                res.append(" ");
            }
        }
        return res.toString();
    }
    public double getTotalScore() {
        return totalScore;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + (isRound(priorityScore) ? String.format("%.0f", priorityScore) : priorityScore) + " " + (isRound(this.totalScore) ? String.format("%.0f", this.totalScore) : this.totalScore) + " " + result;
    }
    private boolean isRound(double x) {
        return (int)x - x == 0;
    }

    
}

class CompareByTotalScoreDesc implements Comparator<Contestant> {
    @Override
    public int compare(Contestant a, Contestant b) {
        return Double.compare(b.getTotalScore(), a.getTotalScore());
    }
}
