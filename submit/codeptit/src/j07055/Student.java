package j07055;

import java.util.Comparator;

public class Student {
    private String id, name, result;
    private double ltScore, thScore, testScore, finalScore;
    private static int count = 0;
    public Student(String name, double ltScore, double thScore, double testScore) {
        this.name = formatName(name);
        count++;
        this.id = String.format("SV%02d", count);
        this.ltScore = ltScore;
        this.thScore = thScore;
        this.testScore = testScore;
        this.finalScore = ltScore * 0.25 + thScore * 0.35 + testScore * 0.4;
        this.result = calResult();
    }
    public double getFinalScore() {
        return finalScore;
    }
    private String calResult() {
        if (finalScore >= 8) {
            return "GIOI";
        } else if (finalScore >= 6.5) {
            return "KHA";
        } else if (finalScore >= 5) {
            return "TRUNG BINH";
        } 
        return "KEM";
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
    @Override
    public String toString(){
        return id + " " + name + String.format(" %.2f ", finalScore) + result;
    } 
}
class CompareByFinalScoreDesc implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return Double.compare(b.getFinalScore(), a.getFinalScore());
    }
}