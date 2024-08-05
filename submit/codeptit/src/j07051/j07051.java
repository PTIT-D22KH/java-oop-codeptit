package j07051;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j07051 {
    public static void main(String[] args) throws IOException{
        // Write your code here
        Scanner input = new Scanner(new File("KHACHHANG.in"));
        // Scanner input = new Scanner(new File("j07051/KHACHHANG.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Customer> a = new ArrayList<>(n);
        for (int i = 0; i < n ;i++) {
            String name, roomId, checkInString, checkOutString;
            long additionalCost;
            name = input.nextLine();
            // System.out.println(name);
            roomId = input.nextLine();
            // System.out.println(roomId);
            checkInString = input.nextLine();
            // System.out.println(checkInString);
            checkOutString = input.nextLine();
            // System.out.println(checkOutString);
            additionalCost = Long.parseLong(input.nextLine());
            a.add(new Customer(name, roomId, checkInString, checkOutString, additionalCost));
        }
        Collections.sort(a, new CompareByTotalCost());
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
        input.close();
    }
}
