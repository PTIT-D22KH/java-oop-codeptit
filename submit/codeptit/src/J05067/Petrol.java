package J05067;

public class Petrol {
    private String type, brand;
    private long singlePrice;
    private double tax;
    public Petrol(String billId) {
        this.type = billId.substring(0, 1);
        this.brand = calBrand(billId.substring(3));
        preSetSinglePriceAndTax();
    }
    private void preSetSinglePriceAndTax( ) {
        if (type.equals("X")) {
            this.singlePrice = 128000;
            this.tax = 0.03;
        } else if (type.equals("D")) {
            this.singlePrice = 11200;
            this.tax = 0.035;
        } else if (type.equals("N")) {
            this.singlePrice = 9700;
            this.tax = 0.02;
            
        }
        if (this.brand.equals("Trong Nuoc")) {
            this.tax = 0.0;
        }
    }
    private String calBrand(String brandId) {
        if (brandId.equals("BP")) {
            return "British Petro";
        } else if (brandId.equals("ES")) {
            return "Esso";
        } else if (brandId.equals("SH")) {
            return "Shell";
        } else if (brandId.equals("CA")) {
            return "Castrol";
        } else if (brandId.equals("MO")) {
            return "Mobil";
        } else if (brandId.equals("TN")) {
            return "Trong Nuoc";
        }
        return "";
        
    }
    public long getSinglePrice() {
        return singlePrice;
    }
    public double getTax() {
        return tax;
    }

    @Override
    public String toString() {
        return brand + " " + singlePrice;
    }
}
