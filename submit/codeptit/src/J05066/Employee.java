package J05066;

import java.util.Comparator;

public class Employee {
    private String id, name, role, coefficient;
    private int stt;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
        this.role = id.substring(0, 2);
        this.coefficient = id.substring(2, 4);
        this.stt = Integer.parseInt(id.substring(4));
    }

    public String getRole() {
        return role;
    }

    public void setId(String id) {
        this.id = id;
        this.role = id.substring(0, 2);
        this.coefficient = id.substring(2, 4);
        this.stt = Integer.parseInt(id.substring(4));
    }

    public String getName() {
        return name;
    }

    public String getCoefficient() {
        return coefficient;
    }

    public int getStt() {
        return stt;
    }

    @Override
    public String toString() {
        return name + " " + role + " " + String.format("%03d", stt) + " " + coefficient;
    }
}

class CompareByCoefficientAndStt implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b) {
        int cmpCoef = b.getCoefficient().compareTo(a.getCoefficient());
        if (cmpCoef == 0) {
            return Integer.compare(a.getStt(), b.getStt());
        }
        return cmpCoef;
    }
}