package J05053;

import java.util.Comparator;

public class Bill {
    private Product product;
    private String id, type, stt;
    private int numBuy, basicCost, discount, totalCost;

    public Bill(String name, String id, int singlePrice, int numBuy) {
        this.product = new Product(name, singlePrice);
        this.id = id;
        this.numBuy = numBuy;
        calSttAndType(id);
        this.basicCost = calBasicCost();
        this.discount = calDiscount();
        this.totalCost = calTotalCost();
    }
    private int calTotalCost(){ 
        return basicCost - discount;
    }
    private int calBasicCost() {
        return product.getSinglePrice() * numBuy;
    }
    private int calDiscount() {
        if (type.equals("1")) {
            return basicCost / 2;
        } 
        return basicCost * 3 / 10;
    }
    private void calSttAndType(String id) {
        this.type = String.valueOf(id.charAt(4));
        this.stt = id.substring(1, 4);
    }

    public String getStt() {
        return stt;
    }

    @Override
    public String toString() {
        return product.getName() + " " + id + " " + stt + " " + discount + " " + totalCost;
    }

}
class CompareByStt implements Comparator<Bill> {
    @Override
    public int compare(Bill a, Bill b) {
        return a.getStt().compareTo(b.getStt());
    }
}