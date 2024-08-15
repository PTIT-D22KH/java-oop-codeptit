package j07053;

public class Contestant {
    private String id, name, dob, result;
    private int age;
    private double lt, th, priorityScore, totalScore;
    private static int count = 0;
    public Contestant(String name, String dob, double lt, double th) {
        this.name = formatName(name);
        this.dob = formatDob(dob);
        this.lt = lt;
        this.th = th;
        this.age = calAge(this.dob);
        this.priorityScore = calPriorityScore();
        this.totalScore = calTotalScore();
        this.result = calResult();
        count++;
        this.id = String.format("PH%02d", count);
    }
    private int calAge(String dob) {
        int year = Integer.parseInt(dob.substring(6));
        return 2024 - year;
    }
    private String formatDob(String dob) {
        String []a = dob.split("/");
        if (a[0].length() == 1) {
            a[0] = "0" + a[0];
        }
        if (a[1].length() == 1) {
            a[1] = "0" + a[1];
        }
        return a[0] + "/" + a[1] + "/" + a[2];
    }
    private String formatName(String name) {
        name = name.toLowerCase();
        String a[] = name.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            res.append(Character.toUpperCase(a[i].charAt(0))).append(a[i].substring(1));
            if (i != a.length - 1) {
                res.append(" ");
            }
        }
        return res.toString();
    }
    private double calPriorityScore() {
        if (lt >= 8 && th >= 8) {
            return 1;
        } else if (lt >= 7.5 && th >= 7.5) {
            return 0.5;
        }
        return 0;
    }
    private double calTotalScore() {
        double score=  ((lt + th) / 2.0) + priorityScore;
        if (score > 10) {
            score = 10;
        }
        return Math.round(score);
    }
    private String calResult() {
        if (totalScore >= 9) {
            return "Xuat sac";
        } else if (totalScore >= 8) {
            return "Gioi";
        } else if (totalScore >= 7) {
            return "Kha";
        } else if (totalScore >= 5) {
            return "Trung binh";
        }
        return "Truot";
    }
    @Override
    public String toString() {
        return id + " " + name +  " " +  age + " " + String.format("%.0f ",totalScore) + result;
    }
    
}
