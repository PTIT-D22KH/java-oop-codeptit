package j05018;

public class Score {
    private double math, vietnamese, english, physics, chemistry, biology, history, geography, gdcd, cn;
    private double average_score;
    
    public Score(double math, double vietnamese, double english, double physics, double chemistry, double biology,
            double history, double geography, double gdcd, double cn) {
        this.math = math;
        this.vietnamese = vietnamese;
        this.english = english;
        this.physics = physics;
        this.chemistry = chemistry;
        this.biology = biology;
        this.history = history;
        this.geography = geography;
        this.gdcd = gdcd;
        this.cn = cn;
        this.average_score = calAvgScore();
    }
    
    private double calAvgScore() {
        double totalScore = math * 2.0 + vietnamese * 2.0 + english + physics + chemistry + biology + history + geography + gdcd + cn;
        double avgScore = totalScore / 12; // Correctly dividing by the total weight
        return Math.round(avgScore * 10) / 10.0;
    }

    public String scoreToResult() {
        if (this.average_score < 5) {
            return "YEU";
        } else if (this.average_score <= 6.9) {
            return "TB";
        } else if (this.average_score <= 7.9) {
            return "KHA";
        } else if (this.average_score <= 8.9) {
            return "GIOI";
        } 
        return "XUAT SAC";
    }
    
    public double getAverage_score() {
        return average_score;
    }

    // @Override
    // public String toString() {
    //     return "Score{" +
    //             "math=" + math +
    //             ", vietnamese=" + vietnamese +
    //             ", english=" + english +
    //             ", physics=" + physics +
    //             ", chemistry=" + chemistry +
    //             ", biology=" + biology +
    //             ", history=" + history +
    //             ", geography=" + geography +
    //             ", gdcd=" + gdcd +
    //             ", cn=" + cn +
    //             ", average_score=" + String.format("%.1f", average_score) +
    //             ", result='" + scoreToResult() + '\'' +
    //             '}';
    // }
}