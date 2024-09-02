package J07056;

import java.util.Comparator;

public class Customer {
    private String name, id;
    private static int count = 0;
    private double standardNum, numUsed, basicCost, additionalCost, tax, totalCost;

    public Customer(String name, String information) {
        this.name = formatName(name);
        String a[] = information.trim().split("\\s+");
        this.standardNum = calStandardNum(a[0]);
        double startNum = Double.parseDouble(a[1]);
        double endNum = Double.parseDouble(a[2]);
        this.numUsed = endNum - startNum;
        count++;
        this.id = String.format("KH%02d", count);
        calBasicCost(this.numUsed);
        this.totalCost = calTotalCost();
    }
    private Double calStandardNum(String x) {
        if (x.equals("A")) {
            return 100d;
        } else if (x.equals("B")) {
            return 500d;
        } else if (x.equals("C")) {
            return 200d;
        }
        return 0d;
    }
    private String formatName(String name) {
        String a[] = name.trim().toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            res.append(Character.toUpperCase(a[i].charAt(0))).append(a[i].substring(1)).append(" ");
        }
        return res.toString().trim();
    }
    private void calBasicCost(double numUsed) {
        if (numUsed > standardNum) {
            basicCost = standardNum * 450;
            additionalCost = (numUsed - standardNum) * 1000;
            tax = additionalCost * 0.05;
        } else {
            basicCost = numUsed * 450;
            additionalCost = 0;
            tax = 0;
        }
    }
    private double calTotalCost() {
        return basicCost + additionalCost + tax;
    }
    public double getTotalCost() {
        return totalCost;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.0f", basicCost) + " " + String.format("%.0f", additionalCost) + " " + String.format("%.0f", tax) + " " + String.format("%.0f", totalCost);
    }
}

class CompareByTotalCost implements Comparator<Customer> {
    @Override
    public int compare(Customer a, Customer b) {
        return Double.compare(b.getTotalCost(), b.getTotalCost());
    }
}