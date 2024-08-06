package j07054;

import java.util.Comparator;

public class Student {
    private String id, name;
    private double score1, score2, score3, averageScore;
    private int rank;
    private static int count = 0;

    public Student(String name, double score1, double score2, double score3) {
        this.name = formatName(name);
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.averageScore = (score1 * 3 + score2 * 3 + score3 * 2) / 8.00;
        count++;
        this.rank = 0;
        this.id = String.format("SV%02d", count);

    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    private String formatName(String name) {
        name = name.toLowerCase();
        String a[] = name.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() != 0) {
                res.append(Character.toUpperCase(a[i].charAt(0))).append(a[i].substring(1));
            if (i != a.length - 1) {
                res.append(" ");
            }
            }
            
        }
        return res.toString();
    }
    public double getAverageScore() {
        return averageScore;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f", averageScore) + " " + rank;
    }
}
class CompareByAverageScoreDesc implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if (Double.compare(b.getAverageScore(), a.getAverageScore()) == 0) {
            return a.getId().compareTo(b.getId());
        }
        return Double.compare(b.getAverageScore(), a.getAverageScore());
    }
}