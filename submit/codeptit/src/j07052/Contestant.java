package j07052;

import java.util.Comparator;

public class Contestant {
    private String id, name;
    private double score1, score2, score3, priorityScore, totalScore;

    public Contestant(String id, String name, double score1, double score2, double score3) {
        this.id = id;
        this.name = formatName(name);
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        if (id.substring(0, 3).equals("KV1")) {
            this.priorityScore = 0.5;
        } else if (id.substring(0, 3).equals("KV2")) {
            this.priorityScore = 1;
        } else {
            this.priorityScore = 2.5;
        }
        this.totalScore = this.score1 * 2 + this.score2 + this.score3 + this.priorityScore;
    }

    private String formatName(String name) {
        name = name.toLowerCase();
        String[] words = name.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String word : words) {
            res.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return res.toString().trim();
    }

    public double getTotalScore() {
        return totalScore;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + formatScore(priorityScore) + " " + formatScore(totalScore);
    }

    private String formatScore(double score) {
        if (score == (int) score) {
            return String.format("%.0f", score);
        } else {
            return String.format("%.1f", score);
        }
    }
}

class CompareByTotalScoreDesc implements Comparator<Contestant> {
    @Override
    public int compare(Contestant a, Contestant b) {
        return Double.compare(b.getTotalScore(), a.getTotalScore());
    }
}