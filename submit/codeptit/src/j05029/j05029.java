package j05029;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05029 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Enterprise> e = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            e.add(new Enterprise(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine())));
        }
        Collections.sort(e, new CompareByCapacityAndId());
        int q = Integer.parseInt(input.nextLine());
        while (q-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n", a, b);
            for (Enterprise s : e) {
                if (s.getCapacity() >= a && s.getCapacity() <= b) {
                    System.out.println(s);
                } else if (s.getCapacity() < a) {
                    break;
                }
                
            }
        }
        
        input.close();
    }
}
