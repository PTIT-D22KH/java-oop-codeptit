package J07054;

public class Transcript implements Comparable<Transcript>{
    private String id, name;
    private static int count = 0;
    private int rank;
    // private int score1, score2, score3;
    private double avgScore;

    public Transcript(String name, int score1, int score2, int score3) {
        this.id = String.format("SV%02d", ++count);
        this.name = formatName(name);
        this.avgScore = calAvgScore(score1, score2, score3);
    }
    private double calAvgScore(int score1, int score2, int score3) {
        return (score1 * 3.0 + score2 * 3.0 + score3 * 2.0) / 8.0;
    }
    private String formatName(String s) {
        String a[] = s.trim().toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            res.append(Character.toUpperCase(a[i].charAt(0))).append(a[i].substring(1)).append(" ");
        }
        return res.toString().trim();
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public double getAvgScore() {
        return avgScore;
    }
    @Override
    public int compareTo(Transcript other) {
        if (this.avgScore == other.avgScore) {
            return this.name.compareTo(other.name);
        }
        return Double.compare(other.avgScore, this.avgScore);
    }
    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f", avgScore) + " " + rank;
    }
}
