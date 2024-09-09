package J05040;

public class Employee {
    private String id, name, role;
    private static int count = 0;
    private long numDays, basicSal, reward, stipend, monthlySal, totalSal;
    public Employee(String name, long basicSal,long numDays, String role) {
        this.name = name;
        count++;
        this.id = String.format("NV%02d", count);
        this.role = role;
        this.numDays = numDays;
        this.basicSal = basicSal;
        this.monthlySal = calMonthlySal();
        this.reward = calReward();
        this.stipend = calStipend();
        
        this.totalSal = calTotalSal(); 
    }

    private long calMonthlySal() {
        return basicSal * numDays;
    }

    private long calReward(){ 
        if (numDays >= 25) {
            return (long)(monthlySal * 0.2);
        } else if (numDays >= 22) {
            return (long)(monthlySal * 0.1);
        }
        return 0;
    }
    private long calStipend() {
        if (role.equals("GD")) {
            return 250000;
        } else if (role.equals("PGD")) {
            return 200000;
        } else if (role.equals("TP")) {
            return 180000;
        } 
        return 150000;
    }
    private long calTotalSal() {
        return monthlySal + stipend + reward;
    }

    @Override
    public String toString(){ 
        return id + " " + name + " " + monthlySal + " " + reward + " " + stipend + " " + totalSal;
    }

    
}
