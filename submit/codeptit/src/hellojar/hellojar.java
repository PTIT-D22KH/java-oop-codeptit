package hellojar;

import hellojar.view.InvoiceView;
import hellojar.vn.edu.ptit.Invoice;

public class hellojar {
    public static void main(String[] args) {
        // Write your code here
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}
