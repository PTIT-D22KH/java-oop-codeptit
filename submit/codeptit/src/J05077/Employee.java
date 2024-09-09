package J05077;

public class Employee {
    private String id, name, group;
    private Department department;
    private long numYears, basicSalary, numDays, coefficient, monthlySalary;

    public Employee(String id, String name, long basicSalary, long numDays) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.numDays = numDays;
        this.group = id.substring(0,1);
        this.numYears = Long.parseLong(id.substring(1, 3));
        this.department = Department.getDepartmentMap().get(id.substring(3));
        this.coefficient = calCoefficient();
        this.monthlySalary = calMonthlySalary();
    }
    private long calMonthlySalary() {
        long res = coefficient * basicSalary * 1000 * numDays;
        return res;
    }
    private long calCoefficient() {
        if (group.equals("A")) {
            if (numYears >= 16) {
                return 20;
            } else if (numYears >= 9) {
                return 14;
            } else if (numYears >= 4) {
                return 12;
            } else  {
                return 10;
            }
        } else if (group.equals("B")) {
            if (numYears >= 16) {
                return 16;
            } else if (numYears >= 9) {
                return 13;
            } else if (numYears >= 4) {
                return 11;
            } else  {
                return 10;
            }
        } else if (group.equals("C")) {
            if (numYears >= 16) {
                return 14;
            } else if (numYears >= 9) {
                return 12;
            } else if (numYears >= 4) {
                return 10;
            } else  {
                return 9;
            }
        } else if (group.equals("D")){
            if (numYears >= 16) {
                return 13;
            } else if (numYears >= 9) {
                return 11;
            } else if (numYears >= 4) {
                return 9;
            } else  {
                return 8;
            }
        }
        return 0;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + department.getName() + " " + monthlySalary;
    }

    


}
