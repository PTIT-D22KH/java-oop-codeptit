package j05014;

import java.util.Comparator;

public class Teacher {
    private String id, groupId,subject, name, result;
    private double m1, m2, priorityScore,totalScore;
    private static int count = 0;

    public Teacher(String name, String groupId, double m1, double m2) {
        this.name = name;
        this.groupId = groupId;
        this.m1 = m1;
        this.m2 = m2;
        count++;
        String s = String.valueOf(count);
        if (s.length() == 1) {
            s = "0" + s;
        }
        this.id = "GV" + s;
        char c = groupId.charAt(0);
        if (c == 'A') {
            this.subject = "TOAN";
        } else if (c == 'B') {
            this.subject = "LY";
        } else if (c == 'C') {
            this.subject = "HOA";
        }
        char d = groupId.charAt(1);
        if (d == '1') {
            this.priorityScore =2 ;
        } else if (d == '2') {
            this.priorityScore = 1.5;
        } else if (d == '3') {
            this.priorityScore = 1;
        }
        this.totalScore = m1 * 2 + m2 + this.priorityScore;
        if (this.totalScore >= 18) {
            this.result = "TRUNG TUYEN";
        } else {
            this.result = "LOAI";
        }
    }
    public double getTotalScore() {
        return totalScore;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + subject + String.format(" %.1f ", totalScore) + result;
    }
}

class CompareByTotalScore implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        int cmpTotalScore = Double.compare(o2.getTotalScore(), o1.getTotalScore());
        if (cmpTotalScore == 0) {
            return o1.getId().compareTo(o2.getId());
        }
        return cmpTotalScore;
    }
}