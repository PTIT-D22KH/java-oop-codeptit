package J05054;

import java.util.Comparator;

public class Student {
    private String id, name, result;
    private double averageScore;
    private int rank;
    private static int count = 0;

    public Student(String name, double averageScore) {
        this.name = name;
        this.averageScore = averageScore;
        count++;
        this.id = String.format("HS%02d", count);
        this.result = calResult();
        this.rank = 0;
    }

    private String calResult() {
        if (averageScore >= 9) {
            return "Gioi";
        } else if (averageScore >= 7) {
            return "Kha";
        } else if (averageScore >= 5) {
            return "Trung Binh";
        }
        return "Yeu";
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return id + " " + name + String.format(" %.1f ", averageScore) + result + " " + rank;
    }
}

class CompareByAvgScore implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return Double.compare(b.getAverageScore(), a.getAverageScore());
    }
}