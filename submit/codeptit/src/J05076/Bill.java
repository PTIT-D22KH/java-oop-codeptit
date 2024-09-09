package J05076;

public class Bill {
    private Product product;
    private long numImport, singlePrice, numExport, totalImportCost, totalExportValue;

    public Bill(Product product, String id, long numImport, long singlePrice, long numExport) {
        this.product = product;
        this.numImport = numImport;
        this.singlePrice = singlePrice;
        this.numExport = numExport;
        this.calTotalImportCost();
        this.calTotalExportValue();
    }

    public Product getProduct() {
        return product;
    }

    public void calTotalImportCost() {
        this.totalImportCost = numImport * singlePrice;
    }

    public void calTotalExportValue() {
        this.totalExportValue = (long) (singlePrice * numExport + singlePrice * numExport * product.getInterestRate());
    }

    @Override
    public String toString() {
        return product + " " + totalImportCost + " " + totalExportValue;
    }
}