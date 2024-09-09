package J07056;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class J07056 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // Write your code here
        // Scanner input = new Scanner(new File("J07056/KHACHHANG.in"));
        Scanner input = new Scanner(new File("KHACHHANG.in"));

        int n = Integer.parseInt(input.nextLine());
        ArrayList<Customer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Customer(input.nextLine(), input.nextLine()));
        }
        Collections.sort(a, new CompareByTotalCost());
        for (Customer x : a) {
            System.out.println(x);
        }
        input.close();

    }
}
