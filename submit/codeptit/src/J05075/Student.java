package J05075;
public class Student {
    private String id, name, className, attendance, note;
    private int score;

    public Student(String id, String name, String className) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.attendance = "";
        this.note = "";
        this.score = 10;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public String getId() {
        return id;
    }

    public void calScore() {
        for (int i = 0; i < attendance.length(); i++) {
            if (attendance.charAt(i) == 'm') {
                score--;
            } else if (attendance.charAt(i) == 'v') {
                score -= 2;
            }
        }
        if (score < 0) {
            score = 0;
        }
        if (score == 0) {
            note = "KDDK";
        }
    }
    public String getClassName() {
        return className;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + score + (score == 0 ? " " + note : "");
    }
}
