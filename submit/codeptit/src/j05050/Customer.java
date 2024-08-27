package j05050;

public class Customer {
    private String id, type;
    private double coefficient, extra, numUsed, basicCost, totalCost;

    private static int count = 0;

    public Customer(String type, double oldNum, double newNum) {
        this.type = type;
        this.numUsed = newNum - oldNum;
        count++;
        this.id = String.format("KH%02d", count);
        this.coefficient = calculateCoefficient();
        this.basicCost = calculateBasicCost();
        this.extra = calculateExtra();
        this.totalCost = calculateTotalCost();
    }

    private double calculateCoefficient() {
        switch (type) {
            case "KD":
                return 3;
            case "NN":
                return 5;
            case "TT":
                return 4;
            case "CN":
                return 2;
            default:
                return 1;
        }
    }

    private double calculateBasicCost() {
        return numUsed * coefficient * 550;
    }

    private double calculateExtra() {
        if (numUsed < 50) {
            return 0;
        } else if (numUsed <= 100) {
            return Math.round(basicCost * 0.35);
        } else {
            return basicCost;
        }
    }

    private double calculateTotalCost() {
        return basicCost + extra;
    }

    @Override
    public String toString() {
        return id + " " + String.format("%.0f", coefficient) + " " + String.format("%.0f", basicCost) + " " + String.format("%.0f", extra) + " " + String.format("%.0f", totalCost);
    }
}