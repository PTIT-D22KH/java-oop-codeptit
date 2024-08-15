package j04015;

public class Teacher {
    private String id, name, role;
    int basicSal, salaryScales, stipend, totalSal;

    public Teacher(String id, String name, int basicSal) {
        this.id = id;
        this.name = name;
        this.basicSal = basicSal;
        this.role = id.substring(0, 2);
        this.salaryScales = Integer.valueOf(id.substring(2));
        if (this.role.equals("HT")) {
            stipend = 2000000;
        } else if (this.role.equals("HP")) {
            stipend = 900000;
        } else if (this.role.equals("GV")) {
            stipend = 500000;
        }
        this.totalSal = this.salaryScales * this.basicSal + this.stipend;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salaryScales + " " + this.stipend + " " + totalSal;
    }

    
}
