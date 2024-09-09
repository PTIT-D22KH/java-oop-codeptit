package J07049;
import java.util.*;
import java.io.*;
public class J07049 {
    public static void main(String[] args) throws IOException{
        // Write your code here
        // Scanner input = new Scanner(new File("J07049/MUAHANG.in"));
        Scanner input = new Scanner(new File("MUAHANG.in"));

        int n = Integer.parseInt(input.nextLine()) ;
        ArrayList<Product> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Product(input.nextLine(), input.nextLine(), Long.parseLong(input.nextLine()), Long.parseLong(input.nextLine())));
        }
        int m = Integer.parseInt(input.nextLine());
        ArrayList<Customer> b = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            b.add(new Customer(input.nextLine(), input.nextLine(), input.nextLine(), Long.parseLong(input.nextLine()), input.nextLine()));
        }
        Collections.sort(b, new CompareByExpiredWarrantyAndCustomerId());
        for (Customer x : b) {
            System.out.println(x);
        }

        input.close();
    }
}
