package j05018;

import java.util.Comparator;

public class Student {
    private String id, name, result;
    private Score score;
    private static int count = 0;
    public Student(String name, double math, double vietnamese, double english, double physics, double chemistry, double biology,
    double history, double geography, double gdcd, double cn) {
        this.name = name;
        this.score = new Score(math, vietnamese, english, physics, chemistry, biology, history, geography, gdcd, cn);
        this.result = this.score.scoreToResult();
        count++;
        String s = String.valueOf(count);
        if(s.length() == 1) {
            s = "0" + s;
        }
        this.id = "HS" + s;
    }
    public String getId() {
        return id;
    }
    public Score getScore() {
        return score;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + this.score.getAverage_score() + " " + result;
    }

    
}
class CompareByAvgScoreAndId implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if (a.getScore().getAverage_score() < b.getScore().getAverage_score()) {
            return 1;
        } else if (a.getScore().getAverage_score() > b.getScore().getAverage_score()) {
            return -1;
        }
        return a.getId().compareTo(b.getId());
    }
}