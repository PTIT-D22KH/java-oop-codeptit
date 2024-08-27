package j07025;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j07025 {
    public static void main(String[] args) throws IOException, ParseException, FileNotFoundException{
        // Write your code here
        Scanner input = new Scanner(new File("j07025/KHACHHANG.in"));
        // Scanner input = new Scanner(new File("KHACHHANG.in"));
        ArrayList<Customer> customers = new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            customers.add(new Customer(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(customers, new CompareByAge());
        for (Customer x : customers) {
            System.out.println(x);
        }
        input.close();
    }
}
