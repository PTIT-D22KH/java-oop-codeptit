package J05066;

import java.util.Comparator;

public class Employee {
    private String id, name, role, stt, coefficient;
    private static int countGD = 0, countTP = 0, countPP = 0;

    public Employee(String s) {
        String[] a = s.trim().split("\\s+");
        this.id = a[0];
        StringBuilder nameBuilder = new StringBuilder();
        for (int i = 1; i < a.length; i++) {
            nameBuilder.append(a[i]).append(" ");
        }
        this.name = nameBuilder.toString().trim();
        this.stt = this.id.substring(4);
        this.coefficient = this.id.substring(2, 4);
        this.role = this.id.substring(0, 2);
    }

    public void correctRole() {
        switch (this.role) {
            case "GD":
                if (countGD < 1) {
                    countGD++;
                } else {
                    this.role = "NV";
                    this.id = "NV" + this.id.substring(2);
                }
                break;
            case "TP":
                if (countTP < 3) {
                    countTP++;
                } else {
                    this.role = "NV";
                    this.id = "NV" + this.id.substring(2);
                }
                break;
            case "PP":
                if (countPP < 3) {
                    countPP++;
                } else {
                    this.role = "NV";
                    this.id = "NV" + this.id.substring(2);
                }
                break;
            default:
                this.role = "NV";
                this.id = "NV" + this.id.substring(2);
                break;
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
        return name + " " + role + " " + String.format("%03d", Integer.parseInt(stt)) + " " + coefficient;
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