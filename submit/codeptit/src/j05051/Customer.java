package j05051;

import java.util.Comparator;

public class Customer {
    private String id, type;
    private double coefficient, extra, numUsed, basicCost, totalCost;

    private static int count = 0;

    public Customer(String type, double oldNum, double newNum)  {
        this.type = type;
        this.numUsed = newNum - oldNum;
        count++;
        this.id = String.format("KH%02d", count);
        this.coefficient = calCoefficient();
        this.basicCost = calBasicCost();
        this.extra = calExtra();
        this.totalCost = calTotalCost();
    }

    private double calCoefficient() {
        if (type.equals("KD")) {
            return 3;
        } else if (type.equals("NN")) {
            return 5;
        } else if (type.equals("TT")) {
            return 4;
        } else if (type.equals("CN")) {
            return 2;
        }
        return 1;
    }
    private double calBasicCost(){ 
        return numUsed * coefficient * 550;
    }
    private double calExtra() {
        if (numUsed < 50) {
            return 0;
        } else if (numUsed <= 100) {
            return Math.ceil(basicCost * 0.35);
        } else {
            return basicCost;
        }
    }

    private double calTotalCost(){ 
        return basicCost + extra;
    }
    public double getTotalCost() {
        return totalCost;
    }
    @Override
    public String toString(){ 
        return id + " "  + String.format("%.0f ", coefficient) + String.format("%.0f ", basicCost) + String.format("%.0f ", extra) + String.format("%.0f", totalCost);
    }
}
class CompareByTotalCost implements Comparator<Customer> {
    @Override
    public int compare(Customer a, Customer b) {
        return Double.compare(b.getTotalCost(), a.getTotalCost());
    }
}