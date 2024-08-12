package hellojar;
// import hellojar.vn.edu.ptit.Student;

import java.util.ArrayList;
import java.util.Scanner;

// import hellojar.view.*;
import hellojar.vn.edu.ptit.*;
public class PaymentController {
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
