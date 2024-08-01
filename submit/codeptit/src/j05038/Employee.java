package j05038;

public class Employee {
    private String id, name, role;
    private double monthlySal, basicSal, numDays, totalSal, stipend, reward;
    private static double sumTotalSal = 0;
    private static int count = 0;
    public Employee(String name, double basicSal, double numDays, String role) {
        this.name = name;
        this.role = role;
        this.basicSal = basicSal;
        this.numDays = numDays;
        this.stipend = calStipend(role);
        count++;
        this.id = String.format("NV%02d", count);
        this.monthlySal = calMonthlySal(basicSal, numDays);
        this.reward = calReward(monthlySal, numDays);
        this.stipend = calStipend(role);
        this.totalSal = calTotalSal(monthlySal, reward, stipend);
        Employee.sumTotalSal += this.totalSal;
    }
    public static double getSumTotalSal() {
        return sumTotalSal;
    }
    private double calMonthlySal(double basicSal, double numDays ) {
        return basicSal * numDays;
    }
    private double calReward(double monthlySal, double numDays) {
        if (numDays >= 25) {
            return monthlySal * 0.2;
        } else if (numDays >= 22) {
            return monthlySal * 0.1;
        }
        return 0;
    }
    private double calTotalSal(double monthlySal, double reward, double stipend) {
        return monthlySal + reward + stipend;
    }
    private double calStipend(String role) {
        switch(role) {
            case "GD" : 
                return 250000;
            case "PGD":
                return 200000;
            case "TP":
                return 180000;
            case "NV":
                return 150000;
            default:
                return 0;
        }
    }
    @Override
    public String toString(){ 
        return id + " " + name + " " + String.format("%.0f", monthlySal) + " " + String.format("%.0f", reward) + " " + String.format("%.0f", stipend) + " " + String.format("%.0f", totalSal);
    }
    
}
