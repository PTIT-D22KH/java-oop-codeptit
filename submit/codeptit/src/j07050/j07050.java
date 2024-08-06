package j07050;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j07050 {
    public static void main(String[] args) throws IOException{
        // Write your code here
        Scanner input = new Scanner(new File("MATHANG.in"));
        // Scanner input = new Scanner(new File("j07050/MATHANG.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Item> a = new ArrayList<>();
        for (int i = 0; i < n; i++ ){
            String name , group;
            double buyPrice, sellPrice;
            name = input.nextLine();
            group = input.nextLine();
            buyPrice = Double.parseDouble(input.nextLine());
            sellPrice = Double.parseDouble(input.nextLine());
            a.add(new Item(name, group, buyPrice, sellPrice));
        }
        Collections.sort(a, new CompareByProfitDesc());
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
        input.close();
    }
}
