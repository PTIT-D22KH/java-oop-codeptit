package J07056;

import java.util.Comparator;

public class Customer {
    private String name, id;
    private static int count = 0;
    private int standardNum, numUsed, basicCost, additionalCost, tax, totalCost;

    public Customer(String name, String information) {
        this.name = formatName(name);
        String[] a = information.trim().split("\\s+");
        this.standardNum = calStandardNum(a[0]);
        int startNum = Integer.parseInt(a[1]);
        int endNum = Integer.parseInt(a[2]);
        this.numUsed = endNum - startNum;
        count++;
        this.id = String.format("KH%02d", count);
        calBasicCost(this.numUsed);
        this.totalCost = calTotalCost();
    }

    private int calStandardNum(String x) {
        switch (x) {
            case "A":
                return 100;
            case "B":
                return 500;
            case "C":
                return 200;
            default:
                return 0;
        }
    }

    private String formatName(String name) {
        String[] a = name.trim().toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String s : a) {
            res.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
        }
        return res.toString().trim();
    }

    private void calBasicCost(int numUsed) {
        if (numUsed > standardNum) {
            basicCost = standardNum * 450;
            additionalCost = (numUsed - standardNum) * 1000;
            tax = (int) (additionalCost * 0.05);
        } else {
            basicCost = numUsed * 450;
            additionalCost = 0;
            tax = 0;
        }
    }

    private int calTotalCost() {
        return basicCost + additionalCost + tax;
    }

    public int getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + basicCost + " " + additionalCost + " " + tax + " " + totalCost;
    }
}

class CompareByTotalCost implements Comparator<Customer> {
    @Override
    public int compare(Customer a, Customer b) {
        return Integer.compare(b.getTotalCost(), a.getTotalCost());
    }
}