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
        if (gpa >= 3.6 && rlScore >= 90) {
            return "XUAT SAC";
        } else if (gpa >= 3.2 && )
    }


    
}
