package J05064;

public class Teacher {
    private static int countHT = 0, countHP = 0;
    private String id, name, role;
    private int  coeffiecient, basicSalary, monthlySalary, stipend, totalSalary;
    public Teacher(String id, String name, int basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.role = calRole();
        this.coeffiecient = calCoefficient();
        this.stipend = calStipend();
        this.monthlySalary = calMonthlySalary();
        this.totalSalary = calTotalSalary();
    }
    private int calTotalSalary() {
        return monthlySalary + stipend;
    }
    private int calMonthlySalary() {
        return coeffiecient * basicSalary;
    }
    private int calStipend() {
        if (role.equals("HT")) {
            countHT++;
            return 2000000;
        } else if (role.equals("HP")) {
            countHP++;
            return 900000;
        }
        return 500000;
    }
    private int calCoefficient(){
        return Integer.parseInt(id.substring(2));
    }
    private String calRole() {
        return id.substring(0,2);
    }
    public static int getCountHP() {
        return countHP;
    }
    public static int getCountHT() {
        return countHT;
    }
    @Override
    public String toString(){
        return id  + " " + name + " "  + coeffiecient + " " + stipend + " " + totalSalary;
    }
}
 