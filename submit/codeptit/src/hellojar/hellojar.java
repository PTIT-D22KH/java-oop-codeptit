package hellojar;
import java.util.*;
import view.*;
import vn.edu.ptit.*;
class PaymentController {
    private Scanner input;

    public PaymentController() {
        input = new Scanner(System.in);

    }

    public Invoice getInvoice() {
        Student st = new Student(input.nextLine(), input.nextLine());
        int t = Integer.parseInt(input.nextLine());
        ArrayList<Subject> v = new ArrayList<>();
        while (t-- > 0) {
            String s1 = input.nextLine();
            String s2 = input.nextLine();
            String s3 = input.nextLine();
            v.add(new Subject(s2, s1, Integer.parseInt(s3)));
        }
        Rule rule = new Rule(input.nextLine(), input.nextLine(), Double.parseDouble(input.nextLine()));
        Invoice a = new Invoice(rule);
        a.setAlSubject(v);
        a.setSt(st);
        int totalCredits = 0;
        for (Subject x : a.getAlSubject()) {
            totalCredits += x.getCredit();
        }
        a.setAmount(a.getRule().getCreditPrice() * totalCredits);
        return a;

    }
}

public class hellojar {
    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
    public static void main2429466(String[] args) {
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
    public static void main8347509(String[] args) {
        // Write your code here
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}
