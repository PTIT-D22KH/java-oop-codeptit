package j05045;

import java.util.Comparator;

public class Employee {
    private String id, name, role;
    private double basicSal, numDays, stipend, monthlySal, advancedSal, remainSal, totalSal;
    private static int count = 0;
    
    public Employee(String name, String role, double basicSal, double numDays) {
        this.name = name;
        this.role = role;
        this.basicSal = basicSal;
        this.numDays = numDays;
        count++;
        this.id = String.format("NV%02d", count);
        this.stipend = calStipend(role);
        this.monthlySal = calMonthlySal();
        this.totalSal = calTotalSal();
        this.advancedSal = calAdvancedSal();
        this.remainSal = this.totalSal - this.advancedSal;
    }
    private double calMonthlySal() {
        return basicSal * numDays;
    }
    private double calStipend(String role) {
        switch(role) {
            case "GD" : 
                return 500;
            case "PGD":
                return 400;
            case "TP":
                return 300;
            case "KT":
                return 250;
            default:
                return 100;
        }
    }
    private double calTotalSal() {
        return monthlySal+ stipend;
    }
    private double calAdvancedSal() {
        if (totalSal * 2/3 < 25000) {
            return Math.round(totalSal * 2 / 3 / 1000) * 1000;
        } 
        return 25000;
    }
    public double getTotalSal() {
        return totalSal;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.0f", stipend) + " " + String.format("%.0f", monthlySal) + " " + String.format("%.0f", advancedSal) + " " + String.format("%.0f", remainSal);
    }
}

class CompareByTotalSal implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b) {
        int compareTotalSal = Double.compare(b.getTotalSal(), a.getTotalSal());
        if (compareTotalSal == 0) {
            return a.getId().compareTo(b.getId());
        }
        return compareTotalSal;
    }
}
