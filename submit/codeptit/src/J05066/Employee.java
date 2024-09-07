package J05066;

import java.util.Comparator;

public class Employee {
    private String id, name, role, stt, coefficient;
    private static int countGD = 0, countTP = 0, countPP = 0;

    public Employee(String s) {
        String[] a = s.trim().split("\\s+");
        this.id = a[0];
        StringBuilder name = new StringBuilder();
        for (int i = 1; i < a.length; i++) {
            name.append(a[i]).append(" ");
        }
        this.name = name.toString().trim();
        this.stt = this.id.substring(4);
        this.coefficient = this.id.substring(2, 4);
        this.role = calRole(this.id.substring(0, 2));
    }

    private String calRole(String role) {
        switch (role) {
            case "GD":
                if (countGD < 1) {
                    countGD++;
                    return role;
                }
                return "NV";
            case "TP":
                if (countTP < 3) {
                    countTP++;
                    return role;
                }
                return "NV";
            case "PP":
                if (countPP < 3) {
                    countPP++;
                    return role;
                }
                return "NV";
            default:
                return "NV";
        }
    }

    public String getName() {
        return name;
    }

    public String getCoefficient() {
        return coefficient;
    }

    public String getStt() {
        return stt;
    }

    @Override
    public String toString() {
        return name + " " + role + " " + stt + " " + coefficient;
    }
}

class CompareByCoefficientAndStt implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b) {
        int cmpCoef = b.getCoefficient().compareTo(a.getCoefficient());
        if (cmpCoef == 0) {
            return a.getStt().compareTo(b.getStt());
        }
        return cmpCoef;
    }
}