package J05076;

public class Bill {
    private Product product;
    private long numImport, singlePrice, numExport, totalImportCost, totalExportValue;

    public Bill(String id, String name, String rank) {
        this.product = new Product(id, name, rank);
        this.numExport = 0;
        this.singlePrice = 0;
        this.numImport = 0;
    }

    public Product getProduct() {
        return product;
    }

    public void setNumExport(long numExport) {
        this.numExport = numExport;
    }

    public void setNumImport(long numImport) {
        this.numImport = numImport;
    }

    public void setSinglePrice(long singlePrice) {
        this.singlePrice = singlePrice;
    }

    public void calTotalImportCost() {
        this.totalImportCost = numImport * singlePrice;
    }

    public void calTotalExportValue() {
        this.totalExportValue = (long) (singlePrice * (1 + this.product.getInterestRate())) * numExport;
    }

    @Override
    public String toString() {
        return product + " " + totalImportCost + " " + totalExportValue;
    }
}