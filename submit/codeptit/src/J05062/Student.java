package J05062;

public class Student {
    private String name, result;
    private double gpa;
    private int rlScore;
    public Student(String name, String score) {
        this.name = name;
        String a[] = score.trim().split("\\s+");
        this.gpa = Double.parseDouble(a[0]);
        this.rlScore = Integer.parseInt(a[1]);
        this.result = calResult();
    }
    private String calResult() {
        if (gpa >= 3.6 ) {
            if (rlScore >= 90) {
                return "XUAT SAC";
            } else if (rlScore >= 80) {
                return "GIOI";
            } else if (rlScore >= 70) {
                return "KHA";
            } else {
                return "KHONG";
            }
            
        } else if (gpa >= 3.2) {
            if (rlScore >= 80) {
                return "GIOI";
            } else if (rlScore >= 70) {
                return "KHA";
            } else {
                return "KHONG";
            }
        } else if (gpa >= 2.5) {
            if (rlScore >= 70) {
                return "KHA";
            } else {
                return "KHONG";
            }
        }
        return "KHONG";
    }
    public void setResult(String result) {
        this.result = result;
    }

    
}
