package j04005;


public class Contestant {
    private String name, dob;
    private double score1, score2, score3;
    private double totalScore;

    public Contestant(String name, String dob, double score1, double score2, double score3) {
        this.name = name;
        this.dob = dob;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.totalScore = score1 + score2 + score3;
    }
    @Override
    public String toString() {
        return name + " " + dob + " " + String.format("%.1f", totalScore);
    }
}
