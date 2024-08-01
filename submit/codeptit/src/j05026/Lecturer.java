package j05026;

public class Lecturer {
    private String id, name, department;
    private static int count = 0;
    public Lecturer(String name, String department) {
        this.name = name;
        this.department = department;
        count++;
        this.id = String.format("GV%02d", count);
    }

    public static String formatDepartment(String department) {
        String a[] = department.split(" ");
        String res = "";
        for (int i = 0; i < a.length; i++) {
            res += Character.toUpperCase(a[i].charAt(0));
        }
        return res;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + formatDepartment(department);
    }
}
