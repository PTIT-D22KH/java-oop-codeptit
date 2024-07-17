package j04013;


public class Contestant {
    private String id, name, result;
    private double score1, score2, score3, priorityScore, totalScore;
    public Contestant(String id, String name, double score1, double score2, double score3) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return id + " " + name + " " + (isRound(priorityScore) ? String.format("%.0f", priorityScore) : priorityScore) + " " + (isRound(this.totalScore - this.priorityScore) ? String.format("%.0f", this.totalScore - this.priorityScore) : this.totalScore - this.priorityScore) + " " + result;
    }
    private boolean isRound(double x) {
        return (int)x - x == 0;
    }

    
}
