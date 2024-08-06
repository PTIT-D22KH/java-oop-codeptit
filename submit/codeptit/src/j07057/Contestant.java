package j07057;

import java.util.Comparator;

public class Contestant {
    private String id, name, ethnic, group, result;
    private double score, priorityScore, totalScore;
    private static int count = 1;
    public Contestant(String name, double score, String ethnic, String group) {
        this.name = formatName(name);
        this.ethnic = ethnic;
        this.group = group;
        this.score = score;
        this.priorityScore = 0;
        calPriorityScore();
        this.totalScore = this.score + this.priorityScore;
        this.result = calResult();
        this.id = String.format("TS%02d", count++);
    }
    private String calResult() {
        if (this.totalScore >= 20.5) {
            return "Do";
        }
        return "Truot";
    }
    private void calPriorityScore() {
        if (group.equals("1")) {
            this.priorityScore += 1.5;
        } else if (group.equals("2")) {
            this.priorityScore += 1;
        }
        if (!ethnic.equalsIgnoreCase("KINH")) {
            this.priorityScore += 1.5;
        }
    }
    private String formatName(String name) {
        name = name.toLowerCase();
        String a[] = name.trim().split("\\s+");
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
    public double getTotalScore() {
        return totalScore;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString(){ 
        return id + " " + name + " " + String.format("%.1f ", totalScore) + result;
    }
}
class CompareByTotalScoreDescIdAsc implements Comparator<Contestant> {
    @Override
    public int compare(Contestant a, Contestant b) {
        int res = Double.compare(b.getTotalScore(), a.getTotalScore());
        if (res == 0) {
            return a.getId().compareTo(b.getId());
        }
        return res;
    }
}