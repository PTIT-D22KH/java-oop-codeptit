package j05048;


public class Product {
    private String id;
    private double numImport, numExport, singlePrice, totalPrice, tax;
    public Product(String id, double numImport) {
        this.id = id;
        this.numImport = numImport;
        this.numExport = calNumExport(id);
        this.singlePrice = calSinglePrice(id);
        this.totalPrice = calTotalPrice();
        this.tax = calTax(id);
    }

    private double calNumExport(String id) {
        if (id.charAt(0) == 'A') {
            return Math.round(0.6 * numImport);
        }
        return Math.round(0.7 * numImport);
    }

    private double calSinglePrice(String id){ 
        if (id.charAt(id.length() - 1) == 'Y') {
            return 110000;
        }
        return 135000;
    }
    private double calTotalPrice(){ 
        return numExport * singlePrice;
    }
    private double calTax(String id){ 
        int n = id.length();
        if (id.charAt(0) == 'A') {
            if (id.charAt(n - 1) == 'Y') {
                return 0.08 * totalPrice;
            } else {
                return 0.11 * totalPrice;
            }
        } else {
            if (id.charAt(n - 1) == 'Y') {
                return 0.17 * totalPrice;
            }
            return 0.22 * totalPrice;
        }
    }

    @Override
    public String toString(){ 
        return id +  " " + String.format("%.0f ", numImport) + String.format("%.0f ", numExport)+ String.format("%.0f ", singlePrice) +  String.format("%.0f ", totalPrice) + String.format("%.0f", tax);
    }
}
